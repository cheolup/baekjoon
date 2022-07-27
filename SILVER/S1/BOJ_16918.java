// BOJ_16918_봄버맨

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16918 {
    static int R,C,N;
    static char[][] map, pre;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R =Integer.parseInt(st.nextToken());
        C =Integer.parseInt(st.nextToken());
        N =Integer.parseInt(st.nextToken());
        map =new char[R][C];
        pre =new char[R][C];
        for(int i=0;i<R;i++){
            String str = br.readLine();
            for(int j=0;j<C;j++){
                map[i][j]=str.charAt(j);
                pre[i][j]=map[i][j];
            }
        }
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        if(N%2==0){
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    sb.append("O");
                }
                sb.append("\n");
            }
        }else {
            for(int k=1;k<=N/2;k++){
                char[][] temp = new char[R][C];
                for(int i=0;i<R;i++){
                    for(int j=0;j<C;j++){
                        temp[i][j]='O';
                    }
                }
                for(int i=0;i<R;i++){
                    for(int j=0;j<C;j++){
                        if(map[i][j]=='O'){
                            temp[i][j]='.';
                            for(int dir=0;dir<4;dir++){
                                int row = i+dx[dir];
                                int col = j+dy[dir];
                                if(row<0||row>=R||col<0||col>=C) continue;
                                temp[row][col]='.';
                            }
                        }
                    }
                }
                for(int i=0;i<R;i++){
                    for(int j=0;j<C;j++){
                        map[i][j]=temp[i][j];
                    }
                }
            }
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    sb.append(map[i][j]);
                }
                sb.append("\n");
            }
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
