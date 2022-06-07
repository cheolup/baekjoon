// BOJ_15652_N과 M (4)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15652 {
    static int N,M;
    static int[] num;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        num = new int[M];
        com(0,0);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    /* ==========com========== */
    static void com(int count, int start){
        if(count==M){
            for (int i=0;i<M;i++){
                sb.append(num[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=start;i<N;i++){
            num[count]=i+1;
            com(count+1,i);
        }
    }
}
