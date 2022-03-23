// BOJ_1213_팰린드롬 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1213 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++)
            count[(str.charAt(i) - 'A')]++;
        int oddCount = 0;
        int odd = -1;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                oddCount++;
                if (odd == -1) {
                    odd = i;
                }
            }
        }
        /* ==========output========== */
        if (oddCount == 0) {
            for (int j = 0; j < 26; j++)
                for (int k = 0; k < count[j] / 2; k++)
                    System.out.print((char) ('A' + j));
            for (int j = 25; j >= 0; j--)
                for (int k = 0; k < count[j] / 2; k++)
                    System.out.print((char) ('A' + j));
        } else if (oddCount == 1) {
            for (int j = 0; j < 26; j++)
                for (int k = 0; k < count[j] / 2; k++)
                    System.out.print((char) ('A' + j));
            System.out.print((char) ('A' + odd));
            for (int j = 25; j >= 0; j--)
                for (int k = 0; k < count[j] / 2; k++)
                    System.out.print((char) ('A' + j));
        } else
            System.out.println("I'm Sorry Hansoo");
        br.close();
    }
}
