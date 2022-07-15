// BOJ_2631_줄세우기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2631 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] num= new int[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        int result=0;
        int[] dp=new int[N];
        dp[0]=1;
        for(int i=1;i<N;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(num[i]>num[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            result=Math.max(result,dp[i]);
        }
        /* ==========output========== */
        System.out.println(N-result);
        br.close();
    }
}
