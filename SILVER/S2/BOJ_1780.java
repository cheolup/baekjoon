// BOJ_1780_종이의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1780 {
    static int N, a, b, c;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        recur(0, 0, N);
        /* ==========output========== */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        br.close();
    }
    /* ==========recur========== */
    static void recur(int row, int col, int size) {
        int num = map[row][col];
        boolean flag = false;
        Loop:
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (map[i][j] != num) {
                    flag = true;
                    break Loop;
                }
            }
        }
        if (flag) {
            int resize = size / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    recur(row + resize * i, col + resize * j, resize);
                }
            }
        } else {
            if (num == -1)
                a++;
            else if (num == 0)
                b++;
            else
                c++;
        }
    }
}
