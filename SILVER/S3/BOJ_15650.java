// BOJ_15650_N과 M (2)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15650 {
    static int N,M;
    static int[] select, input;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        input = new int[N+1];
        select = new int[M];
        for (int i = 1; i <= N; i++)
            input[i] = i;
        per(0,1);
        br.close();
    }
    /* ==========per========== */
    public static void per(int cnt, int start) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(select[i]+ " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= N; i++) {
            select[cnt] = input[i];
            per(cnt + 1, i + 1);
        }
    }
}
