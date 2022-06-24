// BOJ_2638_치즈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_2638 {
    static int N,M;
    static int[][] map;
    static boolean[][] visited, checked, delete;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1];
        for(int i=1;i<=N;i++){
            st= new StringTokenizer(br.readLine());
            for(int j=1;j<=M;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int result=0;
        while(true){
            boolean flag=true;
            for(int i=1;i<=N;i++){
                for(int j=1;j<=M;j++){
                    if(map[i][j]==1){
                        flag=false;
                        break;
                    }
                }
            }
            if(flag) break;
            visited=new boolean[N+1][M+1];
            checked=new boolean[N+1][M+1];
            delete=new boolean[N+1][M+1];
            visited[0][0]=true;
            dfs(0,0);
            for(int i=1;i<=N;i++){
                for(int j=1;j<=M;j++){
                    if(checked[i][j]){
                        int count=0;
                        for(int dir =0;dir<4;dir++) {
                            int row = i + dx[dir];
                            int col = j + dy[dir];
                            if(row<0||row>N||col<0||col>M) continue;
                            if(map[row][col]==0&&visited[row][col]) count++;
                        }
                        if(count>=2){
                            delete[i][j]=true;
                        }
                    }
                }
            }
            for(int i=1;i<=N;i++){
                for(int j=1;j<=M;j++){
                    if(delete[i][j]){
                        map[i][j]=0;
                    }
                }
            }
            result++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void dfs(int x,int y){
        for(int dir =0;dir<4;dir++){
            int row = x + dx[dir];
            int col = y + dy[dir];
            if(row<0||row>N||col<0||col>M||visited[row][col]) continue;
            if(map[row][col]==1){
                checked[row][col]=true;
            }else {
                visited[row][col]=true;
                dfs(row,col);
            }
        }
    }
}
