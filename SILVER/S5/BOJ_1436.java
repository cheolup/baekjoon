// BOJ_1436_영화감독 숌

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int count=1;
        int num=666;
        while (count<N){
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        /* ==========output========== */
        System.out.println(num);
        br.close();
    }
}
