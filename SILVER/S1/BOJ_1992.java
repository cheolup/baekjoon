// BOJ_1992_쿼드트리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1992 {
    static int N;
    static int[][] map;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        /* ==========sol========== */
        recur(0, 0, N);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    /* ==========recur========== */
    static void recur(int x, int y, int n) {
        int temp = map[x][y];
        boolean correct = true;
        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (map[i][j] != temp) {
                    correct = false;
                    break;
                }
            }
        }
        if (correct) {
            sb.append(temp);
        } else {
            sb.append("(");
            recur(x, y, n / 2);
            recur(x, y + n / 2, n / 2);
            recur(x + n / 2, y, n / 2);
            recur(x + n / 2, y + n / 2, n / 2);
            sb.append(")");
        }
    }
}
