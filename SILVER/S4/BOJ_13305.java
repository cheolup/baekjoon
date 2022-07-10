// BOJ_13305_주유소

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13305 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        long[] dis = new long[N-1];
        long[] gas = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N-1;i++){
            dis[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            gas[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        long result=dis[0]*gas[0];
        long temp = gas[0];
        for(int i=1;i<N-1;i++){
            long x = gas[i];
            if(x<temp){
                temp=x;
            }
            result+=temp*dis[i];
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
