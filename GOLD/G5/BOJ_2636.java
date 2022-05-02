// BOJ_2636_치즈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2636 {
    static int N,M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        map=new int[N][M];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int result=0;
        int remain=countCheese();
        int preCheese=0;
        while(remain!=0){
            result++;
            visited=new boolean[N][M];
            dfs(0,0);
            killcheese();
            preCheese=remain;
            remain=countCheese();
        }
        /* ==========output========== */
        System.out.println(result);
        System.out.println(preCheese);
        br.close();
    }
    /* ==========dfs========== */
    static void dfs(int x,int y){
        if(map[x][y]==1){
            map[x][y]=2;
            return;
        }
        for(int dir=0;dir<4;dir++){
            int row=x+dx[dir];
            int col=y+dy[dir];
            if(row>=0&&row<N&&col>=0&&col<M&& !visited[row][col]){
                visited[row][col]=true;
                dfs(row,col);
            }
        }
    }
    /* ==========countCheese========== */
    static int countCheese(){
        int count=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==1) count++;
            }
        }
        return count;
    }
    /* ==========killcheese========== */
    static void killcheese(){
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==2) map[i][j]=0;
            }
        }
    }
}
