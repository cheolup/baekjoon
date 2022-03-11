// BOJ_15829_Hashing

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ_15829 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        /* ==========sol========== */
        int temp = 1234567891;
        long H=0;
        long r=1;
        for(int i=0;i<L;i++){
            H += ((str.charAt(i)-'a'+1)*r)%temp;
            r=(r*31)%temp;
        }
        /* ==========output========== */
        System.out.println(H%temp);

        br.close();
    }


}