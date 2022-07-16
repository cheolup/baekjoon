// BOJ_2225_합분해

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2225 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[][] dp = new int[K+1][N+1];
        for(int i=0;i<=N;i++){
            dp[1][i]=1;
        }
        for(int i=1;i<=K;i++){
            dp[i][0]=1;
        }
        for(int i=2;i<=K;i++){
            for(int j=1;j<=N;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                dp[i][j]%=1000000000;
            }
        }
        /* ==========output========== */
        System.out.println(dp[K][N]);
        br.close();
    }
}
