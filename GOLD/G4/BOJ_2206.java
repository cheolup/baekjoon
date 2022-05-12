// BOJ_2206_벽 부수고 이동하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2206 {
    static int N,M;
    static int[][] map;
    static boolean[][][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static class Node{
        int x,y,hit,depth;
        public Node(int x, int y, int hit, int depth) {
            this.x = x;
            this.y = y;
            this.hit = hit;
            this.depth = depth;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1];
        visited= new boolean[N+1][M+1][2];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j =0;j<M;j++ ){
                map[i+1][j+1]=str.charAt(j)-'0';
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(bfs(1,1));
        br.close();
    }
    /* ==========bfs========== */
    static int bfs(int x, int y){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y, 0,1));
        visited[x][y][0]=true;
        while(!queue.isEmpty()){
            Node now = queue.poll();
            if(now.x==N&&now.y==M){
               return now.depth;
            }
            for(int dir=0;dir<4;dir++){
                int row = now.x+dx[dir];
                int col = now.y+dy[dir];
                if(row<=0||row>N||col<=0||col>M) continue;
                if(map[row][col]==0&&!visited[row][col][now.hit]){
                    queue.add(new Node(row,col,now.hit,now.depth+1));
                    visited[row][col][now.hit]=true;
                }
                if(map[row][col]==1&&now.hit==0&&!visited[row][col][1]){
                    visited[row][col][1]= true;
                    queue.add(new Node(row,col,now.hit+1,now.depth+1));
                }
            }
        }
        return -1;
    }
}
