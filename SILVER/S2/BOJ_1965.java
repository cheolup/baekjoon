// BOJ_1965_상자넣기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1965 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int[] num= new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result=1;
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=1;
            for(int j=1;j<=i;j++){
                if(num[j]<num[i]&&dp[j]>=dp[i]){
                    dp[i]=dp[j]+1;
                    result=Math.max(result,dp[i]);
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
