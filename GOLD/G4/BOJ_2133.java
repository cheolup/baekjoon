// BOJ_2133_타일 채우기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2133 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        if (N % 2 == 1) {
            System.out.println(0);
            System.exit(0);
        }
        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[2] = 3;
        for (int i = 4; i <= N; i += 2) {
            dp[i] = dp[i - 2] * 3;
            for (int j = i - 4; j >= 0; j -= 2) {
                dp[i] += dp[j] * 2;
            }
        }
        /* ==========output========== */
        System.out.println(dp[N]);
        br.close();
    }
}
