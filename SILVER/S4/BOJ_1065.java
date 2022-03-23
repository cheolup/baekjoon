// BOJ_1065_한수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for (int i = 1; i <= N; i++) {
            String str = Integer.toString(i);
            int[] arr = new int[str.length()];
            int[] dif = new int[str.length() - 1];
            for (int j = 0; j < str.length(); j++)
                arr[j] = str.charAt(j);
            for (int k = 0; k < str.length() - 1; k++)
                dif[k] = arr[k] - arr[k + 1];
            if (i <= 999 && !(i > 99 && dif[0] != dif[1]))
                result++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
