// BOJ_2667_단지번호붙이기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2667 {
    static int n,count;
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
        map = new int[n][n];
        visited= new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        /* ==========sol========== */
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j]==1){
                    count=1;
                    bfs(i,j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        /* ==========output========== */
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        br.close();
    }
    /* ==========bfs========== */
    static void bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(new Node(x, y));
        visited[x][y]=true;
        map[x][y]=0;
        while(!queue.isEmpty()){
            Node node = queue.poll();
            for(int dir=0;dir<4;dir++){
                int nextR = node.x+dx[dir];
                int nextC = node.y+dy[dir];
                if(nextR<0||nextR>=n||nextC<0||nextC>=n||map[nextR][nextC]==0||visited[nextR][nextC] )continue;
                queue.add(new Node(nextR, nextC));
                map[nextR][nextC]=0;
                visited[nextR][nextC]=true;
                count++;
            }
        }
    }
}
