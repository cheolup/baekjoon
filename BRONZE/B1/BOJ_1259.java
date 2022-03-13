// BOJ_1259_팰린드롬수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            if (str.charAt(0) == '0')
                break;
            boolean isPalindrome = true;
            for (int i = 0; i < str.length() / 2; i++)
                if (!(str.charAt(i) == str.charAt(str.length() - 1 - i))) {
                    isPalindrome = false;
                    break;
                }
            /* ==========output========== */
            if (isPalindrome)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        br.close();
    }
}
