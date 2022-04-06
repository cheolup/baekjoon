// BOJ_2407_조합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_2407 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        BigInteger[][] d=new BigInteger[N+1][N+1];
        for(int i=1;i<=N;i++){
            d[i][0]=new BigInteger("1");
            d[i][i]=new BigInteger("1");
            for(int j=1;j<i;j++)
                d[i][j]=d[i-1][j-1].add(d[i-1][j]);
        }
        /* ==========output========== */
        System.out.println(d[N][M]);
        br.close();
    }
}
