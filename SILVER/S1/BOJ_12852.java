// BOJ_12852_1로 만들기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_12852 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] dp = new int[N+1];
        int[] result = new int[N+1];
        for(int i=2;i<=N;i++){
            dp[i]=dp[i-1]+1;
            result[i] = i-1;
            if(i%2==0&&dp[i]>dp[i/2]+1){
                dp[i]=dp[i/2]+1;
                result[i]=i/2;
            }
            if(i%3==0&&dp[i]>dp[i/3]+1){
                dp[i]=dp[i/3]+1;
                result[i]=i/3;
            }
        }
        /* ==========output========== */
        System.out.println(dp[N]);
        StringBuilder sb = new StringBuilder();
        sb.append(N).append(" ");
        int n=result[N];
        while (n!=0){
            sb.append(n).append(" ");
            n=result[n];
        }
        System.out.println(sb);
        br.close();
    }
}
