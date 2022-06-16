// BOJ_13460_구슬 탈출 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_13460 {
    static int N, M;
    static char[][] map;
    static int[] dx ={0,1,0,-1};
    static int[] dy ={1,0,-1,0};
    static Node hole;
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static class Bead {
        int redX, redY, blueX, blueY,pre;
        public Bead(int redX, int redY, int blueX, int blueY, int pre) {
            this.redX = redX;
            this.redY = redY;
            this.blueX = blueX;
            this.blueY = blueY;
            this.pre = pre;
        }
        @Override
        public String toString() {
            return "Bead{" +
                    "redX=" + redX +
                    ", redY=" + redY +
                    ", blueX=" + blueX +
                    ", blueY=" + blueY +
                    ", pre=" + pre +
                    '}';
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /* ==========input========== */
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        int redX=0;
        int redY=0;
        int blueX=0;
        int blueY=0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                char c = str.charAt(j);
                if (c == 'R') {
                    redX = i;
                    redY = j;
                    map[i][j]='.';
                }else if (c == 'B') {
                    blueX = i;
                    blueY = j;
                    map[i][j]='.';
                }else if (c == 'O') {
                    hole= new Node(i,j);
                    map[i][j]='.';
                }else {
                    map[i][j]=c;
                }
            }
        }
        /* ==========sol========== */
        int result = bfs(redX, redY, blueX, blueY);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static int bfs(int redX, int redY, int blueX, int blueY){
        boolean[][][][] visited = new boolean[N][M][N][M];
        Queue<Bead> queue = new LinkedList<>();
        queue.add(new Bead(redX, redY, blueX, blueY,-1));
        visited[redX][redY][blueX][blueY]=true;
        int count=1;
        while (!queue.isEmpty()){
            int size=queue.size();
            if(count>10) break;
            for(int i=0;i<size;i++){
                Bead now= queue.poll();
                for(int dir=0;dir<4;dir++){
                    if(now.pre==dir) continue;
                    boolean bluefall=false;
                    boolean redfall=false;
                    int rX=now.redX;
                    int rY=now.redY;
                    int bX=now.blueX;
                    int bY=now.blueY;
                    while(true){
                        boolean move=false;
                        bX+=dx[dir];
                        bY+=dy[dir];
                        if(bX<0||bX>=N||bY<0||bY>=M||map[bX][bY]=='#'||(rX==bX&&rY==bY&&!redfall)){
                            bX-=dx[dir];
                            bY-=dy[dir];
                        }else {
                            move=true;
                            if(bX==hole.x&&bY==hole.y){
                                bluefall=true;
                            }
                        }
                        rX+=dx[dir];
                        rY+=dy[dir];
                        if(rX<0||rX>=N||rY<0||rY>=M||map[rX][rY]=='#'||(rX==bX&&rY==bY)){
                            rX-=dx[dir];
                            rY-=dy[dir];
                        }else {
                            move=true;
                            if(rX==hole.x&&rY==hole.y){
                                redfall=true;
                            }
                        }
                       if(!move) break;
                    }
                    if(bluefall) continue;
                    if(redfall) return count;
                    if(visited[rX][rY][bX][bY]) continue;
                    queue.add(new Bead(rX,rY,bX,bY,dir));
                    visited[rX][rY][bX][bY]=true;
                }
            }
            count++;
        }
        return -1;
    }
}
