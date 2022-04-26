// BOJ_9205_맥주 마시면서 걸어가기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_9205 {
    static int n;
    static boolean[] visited;
    static Node house, festival;
    static Node[] shops;
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= t; test_case++) {
            /* ==========input========== */
            /* ==========sol========== */
            /* ==========output========== */
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            house = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            shops = new Node[n];
            visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                shops[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            festival = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            System.out.println(bfs(house.x, house.y));
        }
        br.close();
    }
    /* ==========bfs========== */
    static String bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        while (!queue.isEmpty()) {
            Node now = queue.poll();
            if (cal(now, festival) <= 1000) return "happy";
            for (int i = 0; i < shops.length; i++) {
                Node temp = shops[i];
                if (cal(now, temp) <= 1000 && !visited[i]) {
                    queue.add(temp);
                    visited[i] = true;
                }
            }
        }
        return "sad";
    }
    /* ==========cal========== */
    static int cal(Node a, Node b) {
        return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
    }
}
