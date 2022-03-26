// BOJ_9012_괄호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int count1 = 0;
            int count2 = 0;
            boolean suc = true;
            if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '(')
                        count1++;
                    else
                        count2++;
                    if (count1 < count2) {
                        suc = false;
                        break;
                    }
                }
                if (count1 != count2)
                    suc = false;
                if (suc)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else
                System.out.println("NO");
        }
        /* ==========sol========== */
        /* ==========output========== */
        br.close();
    }
}