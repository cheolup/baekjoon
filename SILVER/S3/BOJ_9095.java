// BOJ_9095_1, 2, 3 더하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int n = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            /* ==========output========== */
            int[] dp = new int[n+1];
            if(n==1){
                System.out.println(1);
                continue;
            }else if(n==2){
                System.out.println(2);
                continue;
            }else if(n==3){
                System.out.println(4);
                continue;
            }
            dp[1]=1;
            dp[2]=2;
            dp[3]=4;
            for(int i=4;i<=n;i++)
                dp[i]=dp[i-1]+dp[i-2]+ dp[i-3];
            System.out.println(dp[n]);
        }
        br.close();
    }
}
