// BOJ_9465_스티커

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= t; test_case++) {
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            int[][] d = new int[2][N + 1];
            int[][] num = new int[2][N + 1];
            for (int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= N; j++) {
                    num[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            /* ==========sol========== */
            d[0][1] = num[0][1];
            d[1][1] = num[1][1];
            for (int i = 2; i <= N; i++) {
                d[0][i] = Math.max(d[1][i - 1], d[1][i - 2]) + num[0][i];
                d[1][i] = Math.max(d[0][i - 1], d[0][i - 2]) + num[1][i];
            }
            /* ==========output========== */
            System.out.println(Math.max(d[0][N], d[1][N]));
        }
        br.close();
    }
}