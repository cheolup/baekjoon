// BOJ_5525_IOIOI

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5525 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        char[] str;
        str = br.readLine().toCharArray();
        /* ==========sol========== */
        int result = 0;
        int temp = 0;
        boolean flag = false;
        char pre = str[0];
        if (pre == 'I') {
            flag = true;
        }
        for (int i = 1; i < S; i++) {
            char c = str[i];
            if (flag) {
                if (pre == c) {
                    temp = 0;
                    if (-N + 1 >= 1) {
                        result++;
                    }
                    flag = false;
                } else if (pre == 'I' && c == 'O') {
                    temp++;
                } else if (pre == 'O' && c == 'I') {
                    temp++;
                    if ((temp / 2) - N + 1 >= 1) {
                        result++;
                    }
                }
            } else {
                if (pre == c) {
                } else {
                    temp = 1;
                    flag = true;
                }
            }
            pre = c;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
