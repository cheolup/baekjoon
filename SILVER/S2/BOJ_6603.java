// BOJ_6603_로또

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6603 {
    static int k;
    static int[] S, selected;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if (k == 0) break;
            S = new int[k];
            selected = new int[6];
            for (int i = 0; i < k; i++) {
                S[i] = Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            /* ==========output========== */
            com(0, 0);
            System.out.println();
        }
    }
    /* ==========com========== */
    static void com(int count, int start) {
        if (count == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < k; i++) {
            selected[count] = S[i];
            com(count + 1, i + 1);
        }
    }
}
