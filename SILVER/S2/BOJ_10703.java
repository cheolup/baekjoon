// BOJ_10703_유성

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10703 {
    static int R,S;
    static char[][] map;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        map = new char[R][S];
        for(int i=0;i<R;i++){
            String str = br.readLine();
            for(int j=0;j<S;j++){
                map[i][j] = str.charAt(j);
            }
        }
        /* ==========sol========== */
        int min=Integer.MAX_VALUE;
        for(int j=0;j<S;j++){
            int count=0;
            boolean flag=false;
            for(int i=0;i<R;i++){
                if(i+1<R&&map[i][j]=='X'&&map[i+1][j]=='.'){
                    for(int k=i+1; k<R-1; k++) {
                        if(map[k][j]=='#') break;
                        if(map[k][j]=='X') {
                            count = 0;
                            break;
                        }
                        if(map[k][j] =='.') count++;
                    }
                }
                if(count>0 && map[i][j] == '#') {
                    min = Math.min(count, min);
                    count=0;
                }
            }
        }
        int[] star=new int[S];
        for(int j=0;j<S;j++){
            for (int i = R - 1; i >= 0; i--) {
                if (map[i][j] == 'X' && map[i + min][j] == '.') {
                    char temp = map[i][j];
                    map[i][j] = map[i + min][j];
                    map[i + min][j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < S; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
