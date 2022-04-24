// BOJ_2178_미로 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static class Node{
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited= new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        /* ==========sol========== */
        bfs();
        /* ==========output========== */
        System.out.println(map[n-1][m-1]);
        br.close();
    }
    static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0));
        visited[0][0]=true;
        while(!queue.isEmpty()){
            Node node = queue.poll();
            for(int dir=0;dir<4;dir++){
                int nextR = node.x+dx[dir];
                int nextC = node.y+dy[dir];
                if(nextR<0||nextR>=n||nextC<0||nextC>=m||map[nextR][nextC]==0||visited[nextR][nextC] )continue;
                queue.add(new Node(nextR, nextC));
                map[nextR][nextC] = map[node.x][node.y]+1;
                visited[nextR][nextC]=true;
            }
        }
    }
}
