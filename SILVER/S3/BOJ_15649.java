// BOJ_15649_N과 M (1)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649 {
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
        per(0,new boolean[N]);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    /* ==========per========== */
    static void per(int count, boolean[] selected){
        if(count==M){
            for (int i=0;i<M;i++){
                sb.append(num[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<N;i++){
            if(selected[i]) continue;
            selected[i]=true;
            num[count]=i+1;
            per(count+1,selected);
            selected[i]=false;
        }
    }
}
