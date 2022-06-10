// BOJ_10808_알파벳 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        /* ==========sol========== */
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        /* ==========output========== */
        for(int i=0;i<26;i++){
            System.out.print(arr[i]+ " ");
        }
        br.close();
    }
}
