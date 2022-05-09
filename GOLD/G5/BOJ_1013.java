// BOJ_1013_Contact

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            /* ==========sol========== */
            /* ==========output========== */
            String str = br.readLine();
            System.out.println(str.matches("(100+1+|01)+")?"YES":"NO");
        }
        br.close();
    }
}