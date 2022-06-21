// BOJ_17276_배열 돌리기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17276 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int[][] map = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    map[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            /* ==========sol========== */
            boolean reverse=false;
            if(d<0) {
                d=-d/45;
                reverse = true;
            }else {
                d/=45;
            }
            for(int r=0;r<d;r++){
                for(int k=0;k<n/2;k++){
                    int x1 = k;
                    int y1 = k;
                    int x2 = n-1-k;
                    int y2 = n-1-k;
                    if(!reverse){
                        int temp = map[x1][y1];
                        map[x1][y1]=map[n/2][y1];
                        map[n/2][y1]=map[x2][y1];
                        map[x2][y1]=map[x2][n/2];
                        map[x2][n/2]=map[x2][y2];
                        map[x2][y2]=map[n/2][y2];
                        map[n/2][y2]=map[x1][y2];
                        map[x1][y2]=map[x1][n/2];
                        map[x1][n/2]=temp;
                    }else {
                        int temp = map[x1][y1];

                        map[x1][y1]=map[x1][n/2];
                        map[x1][n/2] = map[x1][y2];
                        map[x1][y2]=map[n/2][y2];
                        map[n/2][y2]=map[x2][y2];
                        map[x2][y2]=map[x2][n/2];
                        map[x2][n/2]=map[x2][y1];
                        map[x2][y1]=map[n/2][y1];
                        map[n/2][y1]=temp;
                    }

                }
            }
            /* ==========output========== */
            for (int i = 0; i < n; i++) {
                for(int j=0;j<n;j++){
                    System.out.print(map[i][j]+" ");
                }
                System.out.println();
            }
        }
        br.close();
    }
}
