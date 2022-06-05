// BOJ_3036_링

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3036 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N-1];
        int[] gcds = new int[N-1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        for(int i=0;i<N-1;i++){
            num[i] =Integer.parseInt(st.nextToken());
            gcds[i]=gcd(first,num[i]);
        }
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<N-1;i++){
            System.out.println(first/gcds[i] + "/" + num[i]/gcds[i]);
        }
        br.close();
    }
    static int gcd(int a,int b){
        int temp;
        while(b!=0){
            temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}
