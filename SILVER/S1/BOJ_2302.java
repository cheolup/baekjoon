// BOJ_2302_극장 좌석

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2302 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] num = new int[M];
        for(int i=0;i<M;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        int[] dp=new int[41];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=N;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        int result=1;
        int count=0;
        for(int i=0;i<M;i++){
            int temp =num[i];
            result*=dp[temp-count-1];
            count=temp;
        }
        result*=dp[N-count];
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
