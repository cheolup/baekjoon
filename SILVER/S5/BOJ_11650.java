// BOJ_11650_좌표 정렬하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11650 {
    /* ==========class Node========== */
    static class Node implements Comparable<Node> {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Node o) {
            if (this.x == o.x)
                return this.y - o.y;
            else
                return this.x - o.x;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            nodes[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        /* ==========sol========== */
        Arrays.sort(nodes);
        /* ==========output========== */
        for (int i = 0; i < N; i++)
            System.out.println(nodes[i].x + " " + nodes[i].y);
        br.close();
    }
}
