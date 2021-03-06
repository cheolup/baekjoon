// BOJ_2644_촌수계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2644 {
    static int[][] relation;
    static int[] isSelected;
    static int n, m, start, end;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 사람의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken()); // 시작하는 사람
        end = Integer.parseInt(st.nextToken()); // 끝나는 사람
        m = Integer.parseInt(br.readLine()); // 간선의 개수
        relation = new int[n + 1][n + 1];
        isSelected = new int[n + 1];
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            relation[a][b]=1;
            relation[b][a]=1;
        }
        /* ==========sol========== */
        bfs(start);
        /* ==========output========== */
        System.out.println(isSelected[end]!=0?isSelected[end]:-1);
        br.close();
    }
    /* ==========bfs========== */
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while(!queue.isEmpty()){
            int x = queue.poll();
            for(int i=1;i<=n;i++){
                if(relation[x][i]==0||isSelected[i]!=0)continue;
                queue.add(i);
                isSelected[i]=isSelected[x]+1;
            }
        }
    }
}
