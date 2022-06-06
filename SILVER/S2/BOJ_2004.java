// BOJ_2004_조합 0의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2004 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        /* ==========sol========== */
        long result = Math.min(fun(N,2)-fun(M,2)-fun(N-M,2),fun(N,5)-fun(M,5)-fun(N-M,5));
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static long fun(long N,int num){
        long count=0;
        while (N>0){
            count+=N/num;
            N/=num;
        }
        return count;
    }
}
