// BOJ_11727_2×n 타일링 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11727 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        int[] d = new int[N+1];
        d[1]=1;
        if(N==1){
            System.out.println(d[1]);
            return;
        }
        d[2]=3;
        if(N==2){
            System.out.println(d[2]);
            return;
        }
        for(int i=3;i<=N;i++)
            d[i]=(d[i-1]+2*d[i-2])%10007;
        System.out.println(d[N]);
        br.close();
    }
}
