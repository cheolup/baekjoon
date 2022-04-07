// BOJ_2606_바이러스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2606 {
    static int[] visited;
    static int n, m, result;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<Integer>();
        }
        visited = new int[n + 1];
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            list[from].add(to);
            list[to].add(from);
        }
        /* ==========sol========== */
        result=0;
        bfs(1);
        for (int i = 1; i <= n; i++)
            if(visited[i]!=0)
                result++;
        /* ==========output========== */
        System.out.println(result-1);
        br.close();
    }
    /* ==========bfs========== */
    static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(n);
        visited[n] = 1;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int i = 0; i < list[x].size(); i++) {
                int temp =list[x].get(i);
                if(visited[temp]!=0) continue;
                queue.add(temp);
                visited[temp]=visited[x]+1;
            }
        }
    }
}
