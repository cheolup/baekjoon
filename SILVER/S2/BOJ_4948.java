// BOJ_4948_베르트랑 공준

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            /* ==========input========== */
            int n = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            if(n==0) break;
            boolean[] num = new boolean[2*n+1];
            num[1]=true;
            for(int i=2;i<=2*n;i++){
                int temp=i*2;
                while(temp<=2*n){
                    num[temp]=true;
                    temp+=i;
                }
            }
            int result=0;
            for(int i=n+1;i<=2*n;i++){
                if(!num[i]){
                    result++;
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}
