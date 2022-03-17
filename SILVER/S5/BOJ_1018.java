// BOJ_1018_체스판 다시 칠하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++)
                board[i][j] = str.charAt(j);
        }
        /* ==========sol========== */
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int count = 0;
                for (int a = 0; a < 8; a++) {
                    for (int b = 0; b < 8; b++)
                        if ((a + b) % 2 == 0) {
                            if (board[i + a][j + b] == 'B') count++;
                        } else {
                            if (board[i + a][j + b] == 'W') count++;
                        }
                }
                result = Math.min(result, count);
                count = 0;
                for (int a = 0; a < 8; a++) {
                    for (int b = 0; b < 8; b++)
                        if ((a + b) % 2 == 0) {
                            if (board[i + a][j + b] == 'W') count++;
                        } else {
                            if (board[i + a][j + b] == 'B') count++;
                        }
                }
                result = Math.min(result, count);
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
