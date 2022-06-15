// BOJ_11722_가장 긴 감소하는 부분 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11722 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] num=new int[N];
        int[] dp=new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int max= 1;
        dp[0]=1;
        for(int i=1;i<N;i++){
            dp[i]=1;
            for(int j=0;j<=i;j++){
                if(num[j]>num[i]&&dp[j]>=dp[i]){
                    dp[i]=dp[j]+1;
                    max=Math.max(max,dp[i]);
                }
            }
        }
        /* ==========output========== */
        System.out.println(max);
        br.close();
    }
}
