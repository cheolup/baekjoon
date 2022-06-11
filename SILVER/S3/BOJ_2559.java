// BOJ_2559_수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2559 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] map= new int[N];
        int[] dif= new int[N-K+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            map[i]= Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        for(int i=0;i<N-K+1;i++){
            for(int j=i;j<i+K;j++){
                dif[i]+=map[j];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N-K+1;i++){
            max=Math.max(max,dif[i]);
        }
        /* ==========output========== */
        System.out.println(max);
        br.close();
    }
}
