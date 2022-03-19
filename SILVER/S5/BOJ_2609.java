// BOJ_2609_최대공약수와 최소공배수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2609 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        int result1 = 1;
        for (int i = min; i > 0; i--) {
            if (min % i == 0 && max % i == 0) {
                result1 = i;
                break;
            }
        }
        int result2;
        int i = 1;
        while (true) {
            if (i % min == 0 && i % max == 0) {
                result2 = i;
                break;
            }
            i++;
        }
        /* ==========output========== */
        System.out.println(result1);
        System.out.println(result2);
        br.close();
    }
}
