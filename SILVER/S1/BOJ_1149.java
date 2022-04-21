// BOJ_1149_RGB거리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1149 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] d = new int[N][3];
        st= new StringTokenizer(br.readLine());
        d[0][0] = Integer.parseInt(st.nextToken());
        d[0][1] = Integer.parseInt(st.nextToken());
        d[0][2] = Integer.parseInt(st.nextToken());
        for(int i=1;i<N;i++){
            st= new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            d[i][0] += R + Math.min(d[i-1][1],d[i-1][2]);
            d[i][1] += G + Math.min(d[i-1][0],d[i-1][2]);
            d[i][2] += B + Math.min(d[i-1][0],d[i-1][1]);
        }
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(Math.min(Math.min(d[N-1][0],d[N-1][1]),d[N-1][2]));
        br.close();
    }
}
