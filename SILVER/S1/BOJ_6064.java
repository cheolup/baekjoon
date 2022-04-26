// BOJ_6064_카잉 달력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            st= new StringTokenizer(br.readLine());
            int M=Integer.parseInt(st.nextToken());
            int N=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int lcm = M * N / GCD(M, N);
            int n = 0;
            int result = -1;
            while (n * M < lcm) {
                if ((n * M + x - y) % N == 0) {
                    result = n * M + x;
                    break;
                }
                n++;
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    /* ==========GCD========== */
    static int GCD(int a,int b){
        if(b==0) return a;
        else return GCD(b,a%b);
    }

}
