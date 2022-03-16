// BOJ_11050_이항 계수 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result=fac(N)/(fac(N-K)*fac(K));
        System.out.println(result);

        br.close();
    }
    static int fac(int n){
        if(n<1){
            return 1;
        }else{
            return fac(n-1)*n;
        }
    }
}
