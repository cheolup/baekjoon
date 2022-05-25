// BOJ_2447_별 찍기 - 10

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2447 {
    static char[][] map;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        map = new char[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j]= ' ';
            }
        }
        recur(N,0,0);
        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    static void recur(int N,int x,int y){
        if(N==1){
            map[x][y]='*';
            return;
        }
        int temp =N/3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1&&j==1){
                    continue;
                }else {
                    recur(temp,x+(temp*i),y+(temp*j));
                }
            }
        }
    }

}
