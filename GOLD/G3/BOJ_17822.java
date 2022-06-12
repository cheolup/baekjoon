// BOJ_17822_원판 돌리기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17822 {
    static int N,M,T;
    static int[][] map;
    static boolean[][] delete;
    static int[] dx ={0,1,0,-1};
    static int[] dy ={1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        map=new int[N+1][M];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            delete = new boolean[N+1][M];
            int num=x;
            while (true){
                circulate(x,d,k);
                x+=num;
                if(x>N) break;
            }
            if(check()){
                del();
            }else {
                add();
            }
        }
        /* ==========sol========== */
        int result=0;
        for(int i=1;i<N+1;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==Integer.MIN_VALUE) continue;
                result+=map[i][j];
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void circulate(int x,int d, int k){
        if(d==0){
            for(int i=0;i<k;i++){
                int temp=map[x][M-1];
                for(int j=M-2;j>=0;j--){
                    map[x][j+1]=map[x][j];
                }
                map[x][0]=temp;
            }
        }else {
            for(int i=0;i<k;i++){
                int temp=map[x][0];
                for(int j=0;j<M-1;j++){
                    map[x][j]=map[x][j+1];
                }
                map[x][M-1]=temp;
            }
        }
    }
    static boolean check(){
        boolean flag=false;
        for(int i=1;i<=N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==Integer.MIN_VALUE) continue;
                for(int dir=0;dir<4;dir++){
                    int row =i +dx[dir];
                    int col =j +dy[dir];
                    if(row>N||row<=0) continue;
                    if(col>=M) col=0;
                    else if(col<0) col=M-1;
                    if(map[i][j]==map[row][col]){
                        flag=true;
                        delete[i][j]=true;
                        delete[row][col]=true;
                    }
                }
            }
        }
        return flag;
    }
    static void add(){
        double avg=0;
        int count=0;
        for(int i=1;i<=N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==Integer.MIN_VALUE) continue;
                count++;
                avg+=map[i][j];
            }
        }
        avg/=count;
        for(int i=1;i<=N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==Integer.MIN_VALUE) continue;
                if(map[i][j]>avg){
                    map[i][j]--;
                }else if(map[i][j]<avg){
                    map[i][j]++;
                }
            }
        }
    }
    static void del(){
        for(int i=1;i<=N;i++){
            for(int j=0;j<M;j++){
                if(delete[i][j]){
                    map[i][j]=Integer.MIN_VALUE;
                }
            }
        }
    }
}
