// BOJ_19236_청소년 상어

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_19236 {
    static int result;
    static int[][] fishmap,dirmap;
    static int[] dx = {0,-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,0,-1,-1,-1,0,1,1,1};
    static class Shark {
        int x, y, sum, dir;
        public Shark(int x, int y, int sum, int dir) {
            this.x = x;
            this.y = y;
            this.sum = sum;
            this.dir = dir;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        /* ==========input========== */
        fishmap = new int[4][4];
        dirmap = new int[4][4];
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                fishmap[i][j]=Integer.parseInt(st.nextToken());
                dirmap[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        Shark shark = new Shark(0,0,fishmap[0][0],dirmap[0][0]);
        fishmap[0][0]=0;
        dirmap[0][0]=0;
        result=0;
        dfs(shark,fishmap,dirmap);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    static void dfs(Shark shark, int[][] fishmap,int[][] dirmap) {
        Loop:
        for (int k = 1; k <= 16; k++) { // moving fish
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (fishmap[i][j] != k) continue;
                    int dir = dirmap[i][j];
                    while (true) {
                        int row = i + dx[dir];
                        int col = j + dy[dir];
                        if ((row == shark.x && col == shark.y) || row < 0 || row >= 4 || col < 0 || col >= 4) {
                            dir = dir == 8 ? 1 : dir + 1;
                            continue;
                        }
                        dirmap[i][j] = dirmap[row][col];
                        dirmap[row][col] = dir;
                        fishmap[i][j] = fishmap[row][col];
                        fishmap[row][col] = k;
                        break;
                    }
                    continue Loop;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            int row = shark.x + i*dx[shark.dir];
            int col = shark.y + i*dy[shark.dir];
            if (row < 0 || row >= 4 || col < 0 || col >= 4) continue;
            if (fishmap[row][col] == 0) continue;
            list.add(i);
        }
        if(list.isEmpty()) {
            result=Math.max(result, shark.sum);
        }else {
            for(int i=0;i< list.size();i++){
                int temp =list.get(i);
                int[][] tempfishmap;
                int[][] tempdirmap;
                tempfishmap =copymap(fishmap);
                tempdirmap = copymap(dirmap);
                int sharkX = shark.x+temp*dx[shark.dir];
                int sharkY = shark.y+temp*dy[shark.dir];

                Shark newshark = new Shark(
                        sharkX,
                        sharkY,
                        shark.sum+tempfishmap[sharkX][sharkY],
                        tempdirmap[sharkX][sharkY]
                );
                tempfishmap[sharkX][sharkY]=0;
                tempdirmap[sharkX][sharkY]=0;
                dfs(newshark,tempfishmap,tempdirmap);
            }
        }
    }
    static int[][] copymap(int[][] map){
        int[][] newmap = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                newmap[i][j]=map[i][j];
            }
        }
        return newmap;
    }
}
