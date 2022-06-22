// BOJ_18111_마인크래프트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18111 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int maxH = 0;
        int minH = 256;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxH = Math.max(maxH, map[i][j]);
                minH = Math.min(minH, map[i][j]);
            }
        }

        /* ==========sol========== */
        int resultT = Integer.MAX_VALUE;
        int resultH = 0;
        for (int h = maxH; h >= minH; h--) {
            int[][] diff = new int[N][M];
            int time = 0;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    diff[i][j] = h - map[i][j];
                    sum += diff[i][j];
                }
            }
            if (sum <= B) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        int temp = diff[i][j];
                        if (temp >= 0) {
                            time += temp ;
                        } else {
                            time -= temp* 2;
                        }
                    }
                }
            } else {
                continue;
            }
            if (time <= resultT) {
                if(time == resultT){
                    if(h >= resultH){
                        resultH=h;
                    }else {
                        continue;
                    }
                }else {
                    resultT = time;
                    resultH = h;
                }
            }
        }
        /* ==========output========== */
        System.out.println(resultT + " " +resultH);
        br.close();
    }
}
