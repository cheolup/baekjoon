// BOJ_1260_DFS와 BFS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
    static int[][] map; // 정점의 인접리스트
    static int[] visited; //방문을 한 정점
    static int n, m, v;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        v=Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        visited = new int[n+1];
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x =Integer.parseInt(st.nextToken());
            int y =Integer.parseInt(st.nextToken());
            map[x][y]=1; // 정점이 서로 연결되있으면.
            map[y][x]=1; // 간선의 방향이 없으므로
        }
        /* ==========sol========== */
        /* ==========output========== */
        dfs(v); //dfs실행
        visited = new int[n+1]; // bfs함수를 사용하기위해 visited 초기화
        System.out.println();
        bfs(v);//bfs실행
        br.close();
    }
    /* ==========dfs========== */
    static void dfs(int start){
        visited[start] = 1; // start 정점을 탐색 하였으므로 1로 변경 후 출력
        System.out.print(start+ " ");
        for(int i=0;i<n+1;i++){
            if(map[start][i]==1&&visited[i]==0){
                dfs(i);
            }
        }
    }
    /* ==========bfs========== */
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start]=1;
        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x + " ");
            for(int i=0;i<n+1;i++){
                if(map[x][i]==1&&visited[i]==0){
                    queue.offer(i);
                    visited[i]=1;
                }
            }
        }
    }
}
