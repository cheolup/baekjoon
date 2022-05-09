// BOJ_1010_다리 놓기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_1010 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            BigInteger[] dp = new BigInteger[30];
            dp[0]=new BigInteger("1");
            dp[1]=new BigInteger("1");
            for(int i=2;i<30;i++){
                BigInteger index = new BigInteger(String.valueOf(i));
                dp[i]=dp[i-1].multiply(index);
            }
            /* ==========output========== */
            System.out.println(dp[M].divide(dp[N].multiply(dp[M-N])));
        }
        br.close();
    }
}
