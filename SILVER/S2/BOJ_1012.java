// BOJ_1012_유기농 배추

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1012 {
    static int[][] map;
    static int t, m, n, k, result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for (int test_case = 0; test_case < t; test_case++) {
            /* ==========input========== */
            result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            map = new int[n][m];
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }
            /* ==========sol========== */
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (dfs(i, j)) {
                        result++;
                    }
                }
            }
            dfs(0, 0);
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    /* ==========dfs========== */
    static boolean dfs(int y, int x) {
        if (y < 0 || y >= n || x < 0 || x >= m)
            return false;
        if (map[y][x] == 1) {
            map[y][x] = 0;
            dfs(y + 1, x);
            dfs(y, x + 1);
            dfs(y - 1, x);
            dfs(y, x - 1);
            return true;
        }
        return false;
    }
}
