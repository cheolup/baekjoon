// BOJ_1167_트리의 지름

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1167 {
    static int N, node, result;
    static boolean[] visited;
    static ArrayList<ArrayList<Edge>> edges;
    static class Edge{
        int to,dis;

        public Edge(int to, int dis) {
            this.to = to;
            this.dis = dis;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        edges=new ArrayList<>();
        for(int i=0;i<=N;i++){
            edges.add(new ArrayList<Edge>());
        }
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int nodeA = Integer.parseInt(st.nextToken());
            while(true) {
                int nodeB = Integer.parseInt(st.nextToken());
                if (nodeB == -1) break;
                int dis =Integer.parseInt(st.nextToken());
                edges.get(nodeA).add(new Edge(nodeB,dis));
            }
        }
        /* ==========sol========== */
        result=0;
        visited = new boolean[N+1];
        dfs(1,0);
        visited = new boolean[N+1];
        dfs(node,0);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    /* ==========dfs========== */
    static void dfs(int nodeA,int sum){
        if(sum>result) {
            result=sum;
            node=nodeA;
        }
        visited[nodeA]=true;
        for(int i=0;i<edges.get(nodeA).size();i++){
            Edge now = edges.get(nodeA).get(i);
            if(visited[now.to])continue;
            visited[now.to]=true;
            dfs(now.to,sum+ now.dis);
        }
    }
}
