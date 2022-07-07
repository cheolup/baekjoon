// BOJ_2565_전깃줄

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_2565 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        int[][] cost = new int[N+1][2];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            cost[i][0]=a;
            cost[i][1]=b;
        }
        /* ==========sol========== */
        Arrays.sort(cost, Comparator.comparingInt(A -> A[0]));
        dp[1]=1;
        for(int i=2;i<=N;i++){
            dp[i]=1;
            for(int j=1;j<i;j++){
                if(cost[i][1]>cost[j][1]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int j=1;j<=N;j++){
            if(dp[j]>max){
                max = dp[j];
            }
        }
        /* ==========output========== */
        System.out.println(N-max);
        br.close();
    }
}
