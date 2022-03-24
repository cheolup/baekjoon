// BOJ_1676_팩토리얼 0의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result=0;
        int temp=N/5;
        result+=temp;
        while(temp/5>=1){
            result+=temp/5;
            temp/=5;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
