// BOJ_2630_색종이 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2630 {
    static int N, white = 0, blue = 0;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        recur(N, 0, 0);
        /* ==========output========== */
        System.out.println(white);
        System.out.println(blue);
        br.close();
    }

    /* ==========recur========== */
    static void recur(int size, int row, int col) {
        if (check(size, row, col)) {
            if (map[row][col] == 0)
                white++;
            else
                blue++;
            return;
        }
        int newSize = size / 2;
        recur(newSize, row, col);
        recur(newSize, row + newSize, col);
        recur(newSize, row, col + newSize);
        recur(newSize, row + newSize, col + newSize);
    }

    /* ==========check========== */
    static boolean check(int size, int row, int col) {
        int temp = map[row][col];
        for (int i = row; i < row + size; i++)
            for (int j = col; j < col + size; j++)
                if (map[i][j] != temp)
                    return false;
        return true;
    }
}
