// BOJ_8972_미친 아두이노

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_8972 {
    static int R,C;
    static String str;
    static char[][] map;
    static int[] dx = {0,1,1,1,0,0,0,-1,-1,-1};
    static int[] dy = {0,-1,0,1,-1,0,1,-1,0,1};
    static Node I;
    static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R =Integer.parseInt(st.nextToken());
        C =Integer.parseInt(st.nextToken());
        map =new char[R][C];
        for(int i=0;i<R;i++){
            String str = br.readLine();
            for(int j=0;j<C;j++){
                map[i][j]=str.charAt(j);
                if(map[i][j]=='I'){
                    I=new Node(i,j);
                }
            }
        }
        str = br.readLine();
        /* ==========sol========== */
        for(int k=0;k<str.length();k++){
            int dir = str.charAt(k)-'0';
            I.x+=dx[dir];
            I.y+=dy[dir];
            if(map[I.x][I.y]=='R'){
                System.out.println("kraj "+ (k+1));
                System.exit(0);
            }
            int[][] count = new int[R][C];
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    if(map[i][j]=='R'){
                        int Min=Integer.MAX_VALUE;
                        int rDir=0;
                        for(int d=1;d<=9;d++){
                            if(Min>dis(i+dx[d],j+dy[d],I)){
                                Min=dis(i+dx[d],j+dy[d],I);
                                rDir=d;
                            }
                        }
                        count[i+dx[rDir]][j+dy[rDir]]++;

                    }
                }
            }
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    if(count[i][j]>=1&&I.x==i&&I.y==j){
                        System.out.println("kraj "+ (k+1));
                        System.exit(0);

                    }
                }
            }
            map =new char[R][C];
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    if(count[i][j]==1){
                        map[i][j]='R';
                    }else {
                        map[i][j]='.';
                    }
                }
            }
            map[I.x][I.y]='I';
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static int dis(int x,int y, Node I){
        return Math.abs(I.x-x)+Math.abs(I.y-y);
    }
}