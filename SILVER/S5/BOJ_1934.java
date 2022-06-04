// BOJ_1934_최소공배수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int temp=1;
            for(int i=A;i>0;i--){
                if(A%i==0&&B%i==0){
                    temp=i;
                    break;
                }
            }
            /* ==========output========== */
            System.out.println(A*B/temp);
        }
        br.close();
    }
}
