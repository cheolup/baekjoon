// BOJ_2166_다각형의 면적

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2166 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        long[] X = new long[N+1];
        long[] Y = new long[N+1];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            X[i] =Integer.parseInt(st.nextToken());
            Y[i] =Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        long sumA=0, sumB=0;
        X[N]=X[0];
        Y[N]=Y[0];
        for(int i=0;i<N;i++){
            sumA+=X[i]*Y[i+1];
            sumB+=Y[i]*X[i+1];
        }
        String result = String.format("%.1f",Math.abs(sumA-sumB)/2.0);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
