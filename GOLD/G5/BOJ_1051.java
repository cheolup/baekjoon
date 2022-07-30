// BOJ_1051_숫자 정사각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1051 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        /* ==========sol========== */
        int result = 1;
        int size=Math.max(N,M);
        for(int k=1;k<=size;k++){
            for (int i = 0; i < N-k; i++) {
                for (int j = 0; j < M-k; j++) {
                    if(map[i][j]==map[i+k][j]&&map[i][j]==map[i][j+k]&&map[i][j]==map[i+k][j+k]){
                        result=Math.max(result,(k+1)*(k+1));
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);

        br.close();
    }
}
