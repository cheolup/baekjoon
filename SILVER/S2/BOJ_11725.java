// BOJ_11725_트리의 부모 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11725 {
    static int N;
    static int[] parent;
    static ArrayList<ArrayList<Integer>> edges;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        parent= new int[N+1];
        edges= new ArrayList<>();
        for(int i=0;i<=N;i++)
            edges.add(new ArrayList<>());
        for(int i=0;i<N-1;i++){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        /* ==========sol========== */
        bfs();
        /* ==========output========== */
        for (int i=2;i<=N;i++)
            System.out.println(parent[i]);
        br.close();
    }
    /* ==========bfs========== */
    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        boolean[] visited = new boolean[N+1];
        while(!queue.isEmpty()){
            int now =queue.poll();
            for(int i=0;i<edges.get(now).size();i++){
                int temp = edges.get(now).get(i);
                if(visited[temp]) continue;
                visited[temp]=true;
                parent[temp] = now;
                queue.add(temp);
            }
        }
    }
}
