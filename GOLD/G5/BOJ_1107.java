// BOJ_1107_리모컨

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1107 {
    static int N, M;
    static boolean[] broken = new boolean[10];
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        if (M != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                int temp = Integer.parseInt(st.nextToken());
                broken[temp] = true;
            }
        }
        /* ==========sol========== */
        int result = Math.abs(100 - N);
        for (int i = 0; i < 1000000; i++) {
            String temp = String.valueOf(i);
            int len = temp.length();
            boolean flag = false;
            for (int j = 0; j < len; j++) {
                if (broken[temp.charAt(j) - '0']) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                int min = Math.abs(N - i) + len;
                result = Math.min(result, min);
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
