// BOJ_1912_연속합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1912 {
    static int[][][] dp =new int[21][21][21];
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] num=new int[n];
        int[] dp=new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int max=num[0];
        dp[0]=num[0];
        for(int i=1;i<n;i++){
            dp[i]=Math.max(dp[i-1]+num[i],num[i]);
            max=Math.max(max,dp[i]);
        }
        /* ==========output========== */
        System.out.println(max);
        br.close();
    }
}
