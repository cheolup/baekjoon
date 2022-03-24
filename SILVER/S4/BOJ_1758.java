// BOJ_1758_알바생 강호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_1758 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] tip = new Integer[N];
        for (int i = 0; i < N; i++)
            tip[i] = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        Arrays.sort(tip, Collections.reverseOrder());
        long result = 0;
        int temp;
        for (int i = 0; i < N; i++) {
            temp = tip[i] - i;
            if (temp > 0)
                result += temp;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
