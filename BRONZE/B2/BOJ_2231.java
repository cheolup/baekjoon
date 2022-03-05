// BOJ_2231_분해합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        boolean find = false;
        int temp;
        for (int i = 1; i < N; i++) {
            temp = i;
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++)
                temp += str.charAt(j) - '0';
            if (temp == N) {
                System.out.println(i);
                find = true;
                break;
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        if (!find) {
            System.out.println(0);
        }
        br.close();
    }
}