// BOJ_11729_하노이 탑 이동 순서

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11729 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        recur(N,1,2,3);
        /* ==========output========== */
        System.out.println((int)Math.pow(2,N)-1);
        System.out.println(sb);
        br.close();
    }
    /* ==========recur========== */
    static void recur(int N,int start,int mid, int to){
        if(N==1){
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }
        recur(N-1,start,to,mid);
        sb.append(start).append(" ").append(to).append("\n");
        recur(N-1,mid,start,to);
    }

}
