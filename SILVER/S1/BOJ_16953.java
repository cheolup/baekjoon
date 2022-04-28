// BOJ_16953_A → B

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16953 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 1;
        while (true) {
            if(b==a){
                break;
            }else if(b<a||(b%2==1&&b%10!=1)){
                result= -1;
                break;
            }
            if (b % 2 == 1) {
                b = b / 10;
            } else {
                b = b / 2;
            }
            result++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}