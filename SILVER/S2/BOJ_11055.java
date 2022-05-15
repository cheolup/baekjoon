// BOJ_11055_가장 큰 증가 부분 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11055 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int[] dp = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            dp[i]=num[i];
        }
        /* ==========sol========== */
        int result=0;
        for (int i = 0; i < N; i++) {
            for(int j=0;j<i;j++){
                if(num[i]>num[j]){
                    dp[i]=Math.max(dp[j]+num[i],dp[i]);
                }
            }
            result=Math.max(result,dp[i]);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
