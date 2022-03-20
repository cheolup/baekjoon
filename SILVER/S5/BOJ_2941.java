// BOJ_2941_크로아티아 알파벳

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        /* ==========sol========== */
        for (String s : strArr)
            if (str.contains(s))
                str = str.replace(s, "!");
        /* ==========output========== */
        System.out.println(str.length());
        br.close();
    }
}
