// BOJ_7579_앱

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7579 {
    static int N, M;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] mem = new int[N + 1][2];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            mem[i][0] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            mem[i][1] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int[][] dp = new int[N + 1][100001];
        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= 100000; j++) {
                if (j >= mem[i][1])
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - mem[i][1]] + mem[i][0]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        for (int j = 1; j <= 100000; j++) {
            if (dp[N][j] >= M) {
                result = j;
                break;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
