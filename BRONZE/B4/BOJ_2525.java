// BOJ_2525_오븐 시계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int h = (B+C)/60;
        int m = (B+C)%60;
        if(A+h>=24)
            h=(A+h)%24;
        else
            h+=A;
        /* ==========output========== */
        System.out.println(h + " " + m);
        br.close();
    }
}