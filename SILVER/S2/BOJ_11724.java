// BOJ_11724_연결 요소의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_11724 {
    static int N, M;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        /* ==========sol========== */
        int result = 0;
        for (int i = 1; i <= N; i++)
            if (dfs(i))
                result++;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    /* ==========dfs========== */
    static boolean dfs(int start) {
        if (visited[start]) {
            return false;
        } else {
            visited[start] = true;
            for (int i = 0; i < graph.get(start).size(); i++) {
                int temp = graph.get(start).get(i);
                if (!visited[temp]) {
                    dfs(temp);
                }
            }
        }
        return true;
    }
}
