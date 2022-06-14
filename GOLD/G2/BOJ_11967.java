// BOJ_11967_불켜기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11967 {
    static int N, M;
    static ArrayList<Node>[][] nodeMap;
    static boolean[][] visited;
    static boolean[][] light;
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /* ==========input========== */
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nodeMap = new ArrayList[N + 1][N + 1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < N + 1; j++) {
                nodeMap[i][j] = new ArrayList<>();
            }
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodeMap[x][y].add(new Node(a, b));
        }
        /* ==========sol========== */
        light = new boolean[N + 1][N + 1];
        int result = bfs()+1;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    static int bfs() {
        int count=0;
        visited = new boolean[N + 1][N + 1];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(1, 1));
        visited[1][1] = true;
        light[1][1] = true;
        boolean flag=false;
        while (!queue.isEmpty()) {
            Node now = queue.poll();
            for (int j = 0; j < nodeMap[now.x][now.y].size(); j++) {
                Node temp = nodeMap[now.x][now.y].get(j);
                if(!light[temp.x][temp.y] ){
                    light[temp.x][temp.y] = true;
                    flag=true;
                    count++;
                }
            }
            for (int dir = 0; dir < 4; dir++) {
                int row = now.x + dx[dir];
                int col = now.y + dy[dir];
                if (row <= 0 || row > N || col <= 0 || col > N||visited[row][col]) continue;
                if (light[row][col]) {
                    visited[row][col] = true;
                    queue.add(new Node(row, col));
                }
            }
        }
        if(flag) count+=bfs();
        return count;
    }
}
