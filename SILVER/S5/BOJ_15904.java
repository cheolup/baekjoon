// BOJ_15904_UCPC는 무엇의 약자일까?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15904 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'U' && count == 0) count = 1;
            if (str.charAt(i) == 'C' && count == 1) count = 2;
            if (str.charAt(i) == 'P' && count == 2) count = 3;
            if (str.charAt(i) == 'C' && count == 3) count = 4;
        }
        /* ==========output========== */
        if (count == 4) System.out.println("I love UCPC");
        else System.out.println("I hate UCPC");
        br.close();
    }
}
