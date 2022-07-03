// BOJ_1094_막대기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1094 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int a=64;
        int result=0;
        while (X>0){
            if(a>X){
                a/=2;
            }else {
                X-=a;
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
