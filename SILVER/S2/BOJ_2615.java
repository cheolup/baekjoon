// BOJ_2615_오목

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2615 {
    static int[][] map;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        map=new int[19][19];
        for(int i=0;i<19;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<19;j++){
                map[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        for(int j=0;j<19;j++){
            for(int i=0;i<19;i++){
                if(map[i][j]!=0) {
                    if(check(i, j, map[i][j])){
                        System.out.println(map[i][j]);
                        System.out.println((i+1) + " " + (j+1));
                        return;
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(0);
        br.close();
    }
    static boolean check(int x, int y, int val){
        for(int dir=0;dir<4;dir++) {
            int row = x;
            int col = y;
            int count = 1;
            while (true) {
                row += dx[dir];
                col += dy[dir];
                if (row < 0 || row >= 19 || col < 0 || col >= 19) break;
                if (map[row][col] == val) {
                    count++;
                }else {
                    break;
                }
            }
            row = x;
            col = y;
            while (true) {
                row += dx[(dir + 4)];
                col += dy[(dir + 4)];
                if (row < 0 || row >= 19 || col < 0 || col >= 19) break;
                if (map[row][col] == val) {
                    count++;
                }else {
                    break;
                }

            }
            if(count==5) {
                return true;
            }
        }
        return false;
    }
}
