// BOJ_1389_케빈 베이컨의 6단계 법칙

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_1389 {
    static final int INF = (int) 1e9;
    static int N, M;
    static int[] d;
    static ArrayList<ArrayList<Node>> graph;
    static class Node implements Comparable<Node> {
        int index, distance;
        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
        @Override
        public int compareTo(Node o) {
            return this.distance - o.distance;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());
        d = new int[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph.get(from).add(new Node(to, 1));
            graph.get(to).add(new Node(from, 1));
        }
        /* ==========sol========== */
        int min=Integer.MAX_VALUE;
        int result=-1;
        for(int i=1;i<=N;i++){
            dijkstra(i);
            int sum=0;
            for(int j=1;j<=N;j++)
                sum+=d[j];
            if(min>sum){
                min=sum;
                result=i;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    /* ==========dijkstra========== */
    static void dijkstra(int start) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start, 0));
        Arrays.fill(d, INF);
        d[start] = 0;
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            int now = temp.index;
            int cost = d[now] + 1;
            for (int i = 0; i < graph.get(now).size(); i++) {
                if (cost < d[graph.get(now).get(i).index]) {
                    d[graph.get(now).get(i).index] = cost;
                    queue.add(new Node(graph.get(now).get(i).index, cost));
                }
            }
        }
    }
}
