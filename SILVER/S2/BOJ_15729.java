// BOJ_15729_방탈출

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15729 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N= Integer.parseInt(br.readLine());
        boolean[] button = new boolean[N + 2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            if (Integer.parseInt(st.nextToken()) == 1)
                button[i] = true;
        /* ==========sol========== */
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (button[i]) {
                result++;
                button[i] = !button[i];
                button[i + 1] = !button[i + 1];
                button[i + 2] = !button[i + 2];
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
