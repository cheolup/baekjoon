// BOJ_1475_방 번호


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1475 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int[] num = new int[10];
        int result = 0;
        for (int i = 0; i < str.length(); i++)
            num[str.charAt(i) - '0']++;
        num[6] = (num[6] + num[9] + 1) / 2;
        for (int i = 0; i < 9; i++)
            result = Math.max(result, num[i]);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
