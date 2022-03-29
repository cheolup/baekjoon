// BOJ_1003_피보나치 함수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1003 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            int N = Integer.parseInt(br.readLine());
            if(N==0){
                System.out.println(1 + " " + 0);
            }else{
                int[] arr = new int[N+1];
                arr[0]=0;
                arr[1]=1;
                for(int i=2;i<=N;i++)
                    arr[i]=arr[i-1]+arr[i-2];
                System.out.println(arr[N-1] + " " + arr[N]);
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        br.close();
    }
}
