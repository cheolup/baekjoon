// BOJ_11721_열 개씩 끊어 출력하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            if(i%10==9&&i!=0){
                System.out.println();
            }
        }
        /* ==========output========== */
        br.close();
    }
}
