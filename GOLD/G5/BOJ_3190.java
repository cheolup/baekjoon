// BOJ_3190_뱀

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_3190 {
    static int N, M, L,result;
    static int[][] map;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};
    static int headX=1, headY=1,dir=0;
    static Move[] moves;
    static class Move{
        int X;
        char C;
        public Move(int x, char c) {
            X = x;
            C = c;
        }
    }
    static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static List<Node> tail;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        tail = new ArrayList<Node>(); // 뱀의 꼬리 정보
        map = new int[N+1][N+1]; // [1~N][1~N]탐색을 위해 사이즈 설정
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=2; // 사과는 2로 초기화
        }
        L = Integer.parseInt(br.readLine());
        moves=new Move[L];
        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            moves[i] = new Move(Integer.parseInt(st.nextToken()),st.nextToken().charAt(0));
        }
        /* ==========sol========== */
        /* ==========output========== */
        int start =0;
        result =0;
        makeMap();
        for (int i = 0; i <= L; i++) {
            if(i==L) {
                while(true) {
                    moving();
                    makeMap();
                }
            }
            for(int j=start; j<moves[i].X;j++) {
                moving();
                makeMap();
            }

            start = moves[i].X;
            if(moves[i].C == 'L') {
                dir = (dir+1)%4;
            } else {
                dir = dir-1<0?(dir+3)%4:(dir-1)%4;
            }
        }
        br.close();
    }
    /* ==========makeMap========== */
    static void makeMap(){
        map[headX][headY]=1;
        for(int i = 0; i<tail.size();i++) {
            int row = tail.get(i).x;
            int col = tail.get(i).y;
            map[row][col] = 1;
        }
    }
    /* ==========moving========== */
    static void moving(){
        result++;
        int row = headX+dx[dir];
        int col = headY+dy[dir];
        if(row<1||row>N||col<1||col>N||map[row][col]==1) {
            System.out.println(result);
            System.exit(0);
        }
        tail.add(new Node(headX,headY));
        if(map[row][col]==0) {
            map[tail.get(0).x][tail.get(0).y]=0;
            tail.remove(0);
        }
        headX = row;
        headY = col;
    }
}
