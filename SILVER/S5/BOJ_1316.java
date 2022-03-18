// BOJ_1316_그룹 단어 체커

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++)
            str[i] = br.readLine();
        /* ==========sol========== */
        int result = 0;
        for (int i = 0; i < N; i++) {
            boolean[] arr = new boolean[26];
            boolean isword = true;
            for (int j = 0; j < str[i].length(); j++) {
                char c = str[i].charAt(j);
                if (arr[c - 'a']) {
                    if (str[i].charAt(j) != str[i].charAt(j - 1)) {
                        isword = false;
                        break;
                    }
                } else arr[c - 'a'] = true;
            }
            if (isword) result++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
