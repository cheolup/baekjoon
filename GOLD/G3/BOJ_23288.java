// BOJ_23288_주사위 굴리기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_23288 {
    static int N, M, K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[] dice = {1,2,3,4,5,6}; // 위, 뒤, 오른쪽, 왼쪽, 앞, 아래
    static int X,Y,direction;
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
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        X=0;
        Y=0;
        direction=0;
        int result=0;
        for(int i=0;i<K;i++){
            visited = new boolean[N][M];
            int row = X +dx[direction];
            int col = Y +dy[direction];
            if(row<0||row>=N||col<0||col>=M) {
                direction=(direction+2)%4;
                row = X +dx[direction];
                col = Y +dy[direction];
            }
            int B = map[row][col];
            int C = bfs(row,col,B);
            result+=B*C;
            roll(direction);
            int A= dice[5];
            if(A>B){
                direction=direction==3?0:direction+1;
            }else if(A<B){
                direction=direction==0?3:direction-1;
            }

            X =row;
            Y =col;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void roll(int direction){
        int temp;
        switch (direction){
            case 0:
                temp= dice[0];
                dice[0]=dice[3];
                dice[3]=dice[5];
                dice[5]=dice[2];
                dice[2]=temp;
                break;
            case 1:
                temp= dice[0];
                dice[0]=dice[1];
                dice[1]=dice[5];
                dice[5]=dice[4];
                dice[4]=temp;
                break;
            case 2:
                temp= dice[0];
                dice[0]=dice[2];
                dice[2]=dice[5];
                dice[5]=dice[3];
                dice[3]=temp;
                break;
            case 3:
                temp= dice[0];
                dice[0]=dice[4];
                dice[4]=dice[5];
                dice[5]=dice[1];
                dice[1]=temp;
                break;
        }
    }
    static int bfs(int x,int y,int B){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));
        visited[x][y]=true;
        int count =1;
        while (!queue.isEmpty()){
            Node now = queue.poll();
            for(int dir=0;dir<4;dir++){
                int row = now.x +dx[dir];
                int col = now.y +dy[dir];
                if(row<0||row>=N||col<0||col>=M||visited[row][col]) continue;
                if(map[row][col]==B){
                    queue.add(new Node(row,col));
                    visited[row][col]=true;
                    count++;
                }
            }
        }
        return count;
    }
}
