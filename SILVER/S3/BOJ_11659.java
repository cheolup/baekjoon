// BOJ_11659_구간 합 구하기 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[] d = new int[N];
        st =new StringTokenizer(br.readLine());
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=Integer.parseInt(st.nextToken());
            d[i]=sum;
        }
        for(int k=0;k<M;k++){
            st =new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            int a;
            if(i==1)
                a=0;
            else
                a=d[i-2];
            System.out.println(d[j-1]-a);
        }
        br.close();
    }
}
