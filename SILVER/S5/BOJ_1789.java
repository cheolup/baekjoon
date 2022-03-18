// BOJ_1789_수들의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1789 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        /* ==========sol========== */
        long sum = 0;
        int temp = 1;
        while (true) {
            sum += temp;
            if (sum == N) break;
            else if (sum > N) {
                temp--;
                break;
            }
            temp++;
        }
        /* ==========output========== */
        System.out.println(temp);
        br.close();
    }
}
