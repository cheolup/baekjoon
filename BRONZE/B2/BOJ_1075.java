// BOJ_1075_나누기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1075 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long F = Long.parseLong(br.readLine());
        /* ==========sol========== */
        long num = N - N%100;
        /* ==========output========== */
        for(long i=num;i<num+100;i++){
            if(i%F==0){
                String str =String.valueOf(i);
                System.out.print(str.charAt(str.length()-2));
                System.out.print(str.charAt(str.length()-1));
                break;
            }
        }
        br.close();
    }
}
