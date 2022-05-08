// BOJ_1009_분산처리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int mod = 1;
            for(int i=0;i<b;i++){
                mod = mod*a%10;
            }
            /* ==========output========== */
            if(mod==0){
                System.out.println(10);
            }else {
                System.out.println(mod);
            }
        }
        br.close();
    }
}
