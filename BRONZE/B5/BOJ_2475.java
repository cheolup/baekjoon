// BOJ_2475_검증수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2475 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result=0;
        while (st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            result += x*x;
        }
        /* ==========output========== */
        System.out.println(result%10);
        br.close();
    }
}
