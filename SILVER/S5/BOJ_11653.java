// BOJ_11653_소인수분해

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11653 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        if(N==1){
            System.out.println();
            return;
        }else {
            for(int i=2;i<=N;i++){
                while (true){
                    if(N%i==0){
                        N/=i;
                        System.out.println(i);
                    }else {
                        break;
                    }
                }
            }
        }
        br.close();
    }
}
