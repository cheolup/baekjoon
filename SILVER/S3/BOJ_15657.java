// BOJ_15657_N과 M (8)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15657 {
    static int N,M;
    static int[] input;
    static int[] order;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int[N];
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(input);
        sb = new StringBuilder();
        order=new int[M];
        recur(0,0);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void recur(int count,int start){
        if(count==M){
            for(int i=0;i<M;i++){
                sb.append(order[i]).append(" ");
            }

            sb.append("\n");
            return;
        }
        for(int i=start;i<N;i++){
            order[count]=input[i];
            recur(count+1,i);
        }
    }
}
