// BOJ_9461_파도반 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int N=Integer.parseInt(br.readLine());
            /* ==========sol========== */
            /* ==========output========== */
            long[] d = new long[N+1];
            d[1]=1;
            if(N==1) {
                System.out.println(d[N]);
                continue;
            }
            d[2]=1;
            if(N==2) {
                System.out.println(d[N]);
                continue;
            }
            d[3]=1;
            if(N==3) {
                System.out.println(d[N]);
                continue;
            }
            d[4]=2;
            if(N==4) {
                System.out.println(d[N]);
                continue;
            }
            d[5]=2;
            if(N==5) {
                System.out.println(d[N]);
                continue;
            }
            for(int i=6;i<=N;i++){
                d[i]=d[i-1]+d[i-5];
            }
            System.out.println(d[N]);
        }
        br.close();
    }
}
