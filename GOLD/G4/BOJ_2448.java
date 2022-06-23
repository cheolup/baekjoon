// BOJ_2448_별 찍기 - 11

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2448 {
    static char[][] map;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        map=new char[N][2*N-1];
        for(int i=0;i<N;i++){
            for(int j=0;j<2*N-1;j++){
                map[i][j]=' ';
            }
        }
        recur(0,N-1,N);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            for(int j=0;j<2*N-1;j++){
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void recur(int x,int y, int n){
        if(n==3){
            map[x][y]='*';
            map[x+1][y-1]='*';
            map[x+1][y+1]='*';
            map[x+2][y-2]='*';
            map[x+2][y-1]='*';
            map[x+2][y]='*';
            map[x+2][y+1]='*';
            map[x+2][y+2]='*';
            return;
        }
        int size =n/2;
        recur(x,y,size);
        recur(x+size,y-size,size);
        recur(x+size,y+size,size);
    }
}
