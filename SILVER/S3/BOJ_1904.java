// BOJ_1904_01타일

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1904 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int[] dp = new int[N+1];
        dp[1]=1;
        if(N==1){
            System.out.println(1);
            return;
        }
        dp[2]=2;
        for(int i=3;i<=N;i++){
            dp[i]=(dp[i-1]+dp[i-2])%15746;
        }
        /* ==========output========== */
        System.out.println(dp[N]%15746);
        br.close();
    }
}
