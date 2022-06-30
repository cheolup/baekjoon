// BOJ_1024_수열의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1024 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int start;
        int len=L;
        while (true){
            int sum;
            if(len==2) sum=1;
            else {
                sum=(len-1)*len/2;
            }
            int temp =N-sum;
            if(temp<0|| len >100){
                System.out.println(-1);
                return;
            }
            if(temp % len == 0){
                start = temp / len;
                break;
            }else{
                len++;
            }
        }
        for (int i = start; i < start+len; i++) {
            System.out.format("%d ",i);
        }
        /* ==========output========== */
        br.close();
    }
}
