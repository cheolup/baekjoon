// BOJ_2293_동전 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2293 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] num = new int[n+1];
        for(int i=1;i<=n;i++){
            num[i] =Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        int[] dp = new int[k+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=num[i];j<=k;j++){
                dp[j]+=dp[j-num[i]];
            }
        }
        /* ==========output========== */
        System.out.println(dp[k]);
        br.close();
    }
}
