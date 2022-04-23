// BOJ_1932_정수 삼각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1932 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        int[][] dp = new int[N][N];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<i+1;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
                if(i==N-1){
                    dp[i][j]=map[i][j];
                }
            }
        }
        /* ==========sol========== */
        for(int i=N-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int left = dp[i+1][j];
                int right = dp[i+1][j+1];
                dp[i][j]=map[i][j]+Math.max(left,right);
            }
        }
        /* ==========output========== */
        System.out.println(dp[0][0]);
        br.close();
    }
}
