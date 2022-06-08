// BOJ_2580_스도쿠

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2580 {
    static int[][] map = new int[9][9];
    static boolean flag;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        dfs(0,0);
        /* ==========output========== */
        br.close();
    }

    /* ==========dfs========== */
    static void dfs(int x,int y) {
        if (y==9) {
            dfs(x+1,0);
            return;
        }
        if (x == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }
        if(map[x][y]==0){
            for(int i=1;i<=9;i++){
                if(check(x,y,i)){
                    map[x][y]=i;
                    dfs(x,y+1);
                }
            }
            map[x][y]=0;
            return;
        }
        dfs(x,y+1);
    }

    /* ==========check========== */
    static boolean check(int x, int y, int n) {
        for (int i = 0; i < 9; i++) {
            if (map[x][i] == n) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (map[i][y] == n) return false;
        }
        int a = (x/3)*3;
        int b = (y/3)*3;
        for(int i= a;i<a+3;i++){
            for(int j=b;j<b+3;j++){
                if(map[i][j]==n) return false;
            }
        }
        return true;
    }

}
