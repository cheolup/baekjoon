// BOJ_5582_공통 부분 문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5582 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        /* ==========sol========== */
        int result=0;
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    result=Math.max(result,dp[i][j]);
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
