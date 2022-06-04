// BOJ_2981_검문

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2981 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] num = new int[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        Arrays.sort(num);
        int dif=num[1]-num[0];
        for(int i=2;i<N;i++){
            dif= gcd(dif,num[i]-num[i-1]);
        }
        /* ==========output========== */
        for(int i=2;i<=dif;i++){
            if(dif%i==0){
                System.out.print(i + " ");
            }
        }
        br.close();
    }
    /* ==========gcd========== */
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
