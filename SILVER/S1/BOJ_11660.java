// BOJ_11660_구간 합 구하기 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11660 {
    static int N, M;
    static int[][] map;
    static long[][] d;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map =new int[N+1][N+1];
        d =new long[N+1][N+1];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(i<=1&&j<=1){
                    d[i][j]=map[i][j];
                }else if(i<=1){
                    d[i][j]=map[i][j]+d[i][j-1];
                }else if(j<=1){
                    d[i][j]=map[i][j]+d[i-1][j];
                }else {
                    d[i][j]=map[i][j]+d[i][j-1]+d[i-1][j]-d[i-1][j-1];
                }
            }
        }
        for (int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            long result = d[x2][y2]-d[x2][y1-1]-d[x1-1][y2]+d[x1-1][y1-1];
            System.out.println(result);
        }
        br.close();
    }
}