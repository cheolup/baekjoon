// BOJ_1629_곱셈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1629 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(pow(A,B,C));
        br.close();
    }
    /* ==========pow========== */
    static long pow(long A, long B, long C){
        if(B==1)
            return A%C;
        long temp = pow(A,B/2,C);
        if(B%2==1)
            return (temp*temp%C)*A%C;
        return temp*temp%C;
    }
}
