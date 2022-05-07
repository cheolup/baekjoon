// BOJ_20056_마법사 상어와 파이어볼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_20056 {
    static int N, M, K;
    static int[][] map;
    static ArrayList<Fireball> fireballs;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    static class Fireball {
        int r, c, m, s, d;

        public Fireball(int r, int c, int m, int s, int d) {
            this.r = r;
            this.c = c;
            this.m = m;
            this.s = s;
            this.d = d;
        }
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        fireballs = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            fireballs.add(new Fireball(r, c, m, s, d));
        }
        for (int i = 0; i < K; i++) {
            map = new int[N + 1][N + 1];
            moveFireball();
            if(checkDivide()) continue;;
            unionFireball();
        }
        int result=0;
        for(Fireball fireball : fireballs){
            result +=fireball.m;
        }
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void moveFireball() {
        for (int i = 0; i < fireballs.size(); i++) {
            int dir = fireballs.get(i).d;
            int speed = fireballs.get(i).s;
            int row = fireballs.get(i).r + dx[dir]*speed;
            int col = fireballs.get(i).c + dy[dir]*speed;
            row= (row-1)%N+1;
            col= (col-1)%N+1;
            if(row<=0){
                row+=N;
            }
            if(col<=0){
                col+=N;
            }
            fireballs.get(i).r=row;
            fireballs.get(i).c=col;
            map[row][col]++;
        }
    }
    static boolean checkDivide(){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(map[i][j]>=2) return false;
            }
        }
        return true;
    }
    static void unionFireball(){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                ArrayList<Fireball> tempList = new ArrayList<>();
                if(map[i][j]>=2) {
                    int size =fireballs.size();
                    for(int k=size-1;k>=0;k--){
                        if(fireballs.get(k).r==i&&fireballs.get(k).c==j){
                            tempList.add(fireballs.get(k));
                            fireballs.remove(fireballs.get(k));
                        }
                    }
                } else {
                    continue;
                }
                int mass=0;
                int speed=0;
                int dir=tempList.get(0).d%2;
                boolean flag=true;
                for(Fireball fireball : tempList){
                    mass+=fireball.m;
                    speed+=fireball.s;
                    if(dir!=fireball.d%2){
                        flag=false;
                    }
                }
                if(mass/5<=0) continue;
                if(flag) {
                    fireballs.add(new Fireball(i,j,mass/5,speed/map[i][j],0));
                    fireballs.add(new Fireball(i,j,mass/5,speed/map[i][j],2));
                    fireballs.add(new Fireball(i,j,mass/5,speed/map[i][j],4));
                    fireballs.add(new Fireball(i,j,mass/5,speed/map[i][j],6));
                }else {
                    fireballs.add(new Fireball(i,j,mass/5,speed/map[i][j],1));
                    fireballs.add(new Fireball(i,j,mass/5,speed/map[i][j],3));
                    fireballs.add(new Fireball(i,j,mass/5,speed/map[i][j],5));
                    fireballs.add(new Fireball(i,j,mass/5,speed/map[i][j],7));
                }
            }
        }
    }
}
