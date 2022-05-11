// BOJ_2239_스도쿠

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2239 {
    static int[][] map = new int[9][9];
    static boolean flag;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            String str = br.readLine();
            for (int j = 0; j < 9; j++) {
                map[i][j] = str.charAt(j)-'0';
            }
        }
        /* ==========sol========== */
        dfs(0);
        /* ==========output========== */
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        br.close();
    }
    /* ==========dfs========== */
    static void dfs(int d){
        if(d==81){
            flag = true;
            return;
        }
        int row = d/9;
        int col = d%9;
        if(map[row][col]!=0){
            dfs(d+1);
        }else {
            for(int i=1;i<10;i++){
                if(!check(row,col,i)) continue;
                map[row][col] = i;
                dfs(d+1);
                if(flag) return;
                map[row][col]=0;
            }
        }
    }
    /* ==========check========== */
    static boolean check(int x,int y, int n){
        for(int i=0;i<9;i++){
            if(map[i][y]==n||map[x][i]==n) return false;
        }
        int inX = x/3*3;
        int inY =y-y%3;
        for(int i=inX;i<inX+3;i++){
            for(int j=inY;j<inY+3;j++){
                if(map[i][j]==n) return false;
            }
        }
        return true;
    }

}
