// BOJ_3009_네 번째 점

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3009 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] x= new int[1001];
        int[] y= new int[1001];
        for(int i=0;i<3;i++){
            st = new StringTokenizer(br.readLine());
            x[Integer.parseInt(st.nextToken())]++;
            y[Integer.parseInt(st.nextToken())]++;
        }
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=1;i<=1000;i++){
            if(x[i]%2==1){
                System.out.print(i);
            }
        }
        System.out.print(" ");
        for(int i=1;i<=1000;i++){
            if(y[i]%2==1){
                System.out.print(i);
            }
        }
        br.close();
    }
}