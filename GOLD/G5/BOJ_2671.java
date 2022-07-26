// BOJ_2671_잠수함식별

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2671 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        /* ==========sol========== */
        String pattern = "(100+1+|01)+";
        /* ==========output========== */
        System.out.println(str.matches(pattern)?"SUBMARINE":"NOISE");
        br.close();
    }
}
