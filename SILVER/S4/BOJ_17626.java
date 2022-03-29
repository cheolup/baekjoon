// BOJ_17626_Four Squares

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17626 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] d = new int[n+1];
        d[1]=1;
        for(int i=2;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int temp =i-j*j;
                min = Math.min(min,d[temp]);
            }
            d[i] = min + 1;
        }
        /* ==========output========== */
        System.out.println(d[n]);
        br.close();
    }
}