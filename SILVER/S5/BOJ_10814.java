// BOJ_10814_나이순 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10814 {
    /* ==========class Node========== */
    static class Node implements Comparable<Node> {
        int age;
        String name;

        public Node(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Node o) {
            return this.age - o.age;
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
            nodes[i] = new Node(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(nodes);
        /* ==========output========== */
        for (int i = 0; i < N; i++)
            System.out.println(nodes[i].age + " " + nodes[i].name);
        br.close();
    }
}
