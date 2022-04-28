// BOJ_2156_포도주 시식

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2156 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] wine = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=1;i<=n;i++)
            wine[i]=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        dp[1]=wine[1];
        if(n==1){
            System.out.println(dp[1]);
            return;
        }
        dp[2]=wine[1]+wine[2];
        if(n==2){
            System.out.println(dp[2]);
            return;
        }
        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+wine[i]);
            dp[i]=Math.max(dp[i],dp[i-3]+wine[i]+wine[i-1]);
        }
        System.out.println(dp[n]);
        br.close();
    }
}
