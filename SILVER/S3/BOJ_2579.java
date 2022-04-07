// BOJ_2579_계단 오르기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2579 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] map = new int[N];
        int[] d = new int[N];
        for (int i = 0; i < N; i++)
            map[i] = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        d[0] = map[0];
        /* ==========output========== */
        if(N==1){
            System.out.println(d[0]);
            return;
        }
        d[1] = map[0]+map[1];
        if(N==2){
            System.out.println(d[1]);
            return;
        }
        d[2] = Math.max(map[0]+map[2], map[1]+map[2]);
        for(int i=3;i<N;i++)
            d[i]=Math.max(d[i-3]+map[i]+map[i-1],d[i-2]+map[i]);
        System.out.println(d[N-1]);
        br.close();
    }
}
