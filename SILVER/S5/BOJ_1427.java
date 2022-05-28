// BOJ_1427_소트인사이드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int[] num = new int[10];
        for(int i=0;i<str.length();i++){
            num[str.charAt(i)-'0']++;
        }
        /* ==========output========== */
        for(int i=9;i>=0;i--){
            for(int j=0;j<num[i];j++){
                System.out.print(i);
            }
        }
        br.close();
    }
}
