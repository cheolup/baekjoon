// BOJ_11047_동전 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        for(int i=0; i<N;i++)
            coin[N-1-i]=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result =0;
        for(int i=0; i<N;i++){
            if(K/coin[i]>=1){
                result+=K/coin[i];
                K=K%coin[i];
            }
            if(K==0)
                break;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
