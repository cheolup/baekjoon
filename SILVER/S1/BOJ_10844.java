// BOJ_10844_쉬운 계단 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10844 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        long[][] dp = new long[N+1][10];
        long mod =1000000000;
        dp[1][0]=0L;
        for(int i=1;i<10;i++)
            dp[1][i]=1L;
        for(int i=2;i<=N;i++) {
            dp[i][0] = dp[i - 1][1];
            for(int j=1;j<=9;j++){
                if(j==9){
                    dp[i][9] = dp[i-1][8]%mod;
                }else {
                    dp[i][j] = (dp[i-1][j-1]%mod+dp[i-1][j+1]%mod)%mod;
                }
            }
        }
        long result=0;
        for(int i=0;i<10;i++)
            result=(result+dp[N][i])%mod;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
