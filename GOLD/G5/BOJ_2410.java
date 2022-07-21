// BOJ_2410_2의 멱수의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2410 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        if(N==1){
            System.out.println(1);
            System.exit(0);
        }
        int[] dp = new int[N+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=N;i++){
            if(i%2==0){
                dp[i]=(dp[i-1]+dp[i/2])%1000000000;
            }else {
                dp[i]=dp[i-1]%1000000000;
            }
        }
        /* ==========output========== */
        System.out.println(dp[N]%1000000000);
        br.close();
    }
}
