// BOJ_17142_연구소 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_17142 {
    static int N, M, result, blank;
    static int[][] map;
    static boolean[][] visited, check;
    static ArrayList<Node> virus;
    static Node[] selectVirus;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static class Node {
        int x, y;
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
        map = new int[N][N];
        selectVirus = new Node[M];
        virus = new ArrayList<>();
        blank=0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    virus.add(new Node(i, j));
                }else if(map[i][j]==0){
                    blank++;
                }
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        if(blank==0){
            System.out.println(0);
            System.exit(0);
        }
        result = Integer.MAX_VALUE;
        com(0, 0);
        if(result==Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(result);
        }
        br.close();
    }
    static void com(int count, int start) {
        if (count == M) {
            bfs(selectVirus);
            return;
        }
        for (int i = start; i < virus.size(); i++) {
            selectVirus[count] = virus.get(i);
            com(count + 1, i + 1);
        }
    }
    static void bfs(Node[] selectV) {
        int time =0;
        int count=blank;
        check = new boolean[N][N];
        visited = new boolean[N][N];
        Queue<Node> queue = new LinkedList<>();
        for (Node v : selectV) {
            queue.add(v);
            visited[v.x][v.y] = true;
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node now = queue.poll();
                for (int dir = 0; dir < 4; dir++) {
                    int row = now.x + dx[dir];
                    int col = now.y + dy[dir];
                    if (row < 0 || row >= N || col < 0 || col >= N ||visited[row][col]) continue;
                    if(map[row][col] == 0 ){
                        visited[row][col]=true;
                        queue.add(new Node(row,col));
                        count--;
                    }else if(map[row][col] == 2 ){
                        visited[row][col]=true;
                        queue.add(new Node(row,col));
                    }
                }
            }
            time++;
            if(time>=result) return ;
            if(count<=0) {
                result = time;
            }
        }
    }
}
