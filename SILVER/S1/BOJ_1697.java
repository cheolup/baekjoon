// BOJ_1697_숨바꼭질

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {
    static int[] map = new int[100001];
    static boolean[] visited = new boolean[100001];
    static int n, k;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        bfs(n);
        /* ==========output========== */
        System.out.println(map[k]);
        br.close();
    }
    /* ==========bfs========== */
    static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        map[n]=0;
        visited[n] = true;
        while(!queue.isEmpty()){
            int x = queue.poll();
            if(x==k) return;
            if(x-1>=0&&!visited[x-1]) {
                visited[x-1]= true;
                map[x-1]= map[x]+1;
                queue.add(x-1);
            }
            if(x+1<=100000&&!visited[x+1]) {
                visited[x+1]= true;
                map[x+1]= map[x]+1;
                queue.add(x+1);
            }
            if(2*x<=100000&&!visited[2*x]) {
                visited[2*x]= true;
                map[2*x]= map[x]+1;
                queue.add(2*x);
            }
        }
    }
}
