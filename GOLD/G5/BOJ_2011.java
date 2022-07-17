// BOJ_2011_암호코드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2011 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int len = str.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        if (str.charAt(0) == '0') {
            System.out.println(0);
            System.exit(0);
        }
        for (int i = 2; i <= len; i++) {
            char c2 = str.charAt(i - 2);
            char c1 = str.charAt(i - 1);
            if (c1 != '0') {
                dp[i] += dp[i - 1]%1000000;
            }
            if (!(c2 == '0'||c2>'2'||c2=='2'&&c1>'6')) {
                dp[i] += dp[i - 2]%1000000;
            }
        }
        /* ==========output========== */
        System.out.println(dp[len]%1000000);
        br.close();
    }
}
