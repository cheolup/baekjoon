// BOJ_1032_명령 프롬프트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1032 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        char[] c = br.readLine().toCharArray();
        for(int i=1;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<str.length();j++){
                if(c[j]!=str.charAt(j)){
                    c[j]='?';
                }
            }
        }
        /* ==========output========== */
        for(int j=0;j<c.length;j++){
            System.out.print(c[j]);
        }
        br.close();
    }
}
