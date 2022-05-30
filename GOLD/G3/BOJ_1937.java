// BOJ_1937_욕심쟁이 판다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1937 {
    static int n;
    static int[][] map, dp;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map= new int[n][n];
        dp= new int[n][n];
        for (int i = 0; i < n; i++) {
            st= new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int result=0;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                result = Math.max(result,dfs(i,j));
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    /* ==========dfs========== */
    static int dfs(int x, int y){
        if (dp[x][y] != 0) {
            return dp[x][y];
        }
        dp[x][y]=1;
        for(int dir=0;dir<4;dir++){
            int row = x +dx[dir];
            int col = y +dy[dir];
            if(row<0||row>=n||col<0||col>=n||map[x][y]>=map[row][col]) continue;
            dp[x][y]=Math.max(dp[x][y],dfs(row,col)+1);
        }
        return dp[x][y];
    }
}
