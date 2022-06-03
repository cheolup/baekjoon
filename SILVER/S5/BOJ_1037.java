// BOJ_1037_약수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1037 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int temp=Integer.parseInt(st.nextToken());
            max=Math.max(max,temp);
            min=Math.min(min,temp);
        }
        /* ==========output========== */
        System.out.println(min*max);
        br.close();
    }
}
