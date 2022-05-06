// BOJ_7576_토마토

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7576 {
    static int n, m, max;
    static int[][] map;
    static boolean[][] visited;
    static List<Tomato> tomatos;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static class Tomato {
        int x;
        int y;

        Tomato(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map =new int[n][m];
        visited = new boolean[n][m];
        tomatos = new ArrayList<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1){
                    tomatos.add(new Tomato(i, j));
                }
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        if(!search()){
            System.out.println(0);
            System.exit(0);
        }
        bfs();
        if(search()){
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(max-1);
        br.close();
    }
    /* ==========bfs========== */
    static void bfs(){
        Queue<Tomato> queue =new LinkedList<>();
        for (Tomato init : tomatos) {
            queue.offer(init);
            visited[init.x][init.y] = true;
        }
        while(!queue.isEmpty()){
            Tomato temp = queue.poll();
            for(int dir=0; dir<4;dir++){
                int row = temp.x +dx[dir];
                int col = temp.y +dy[dir];
                if(row<0||row>=n||col<0||col>=m||map[row][col]==-1||visited[row][col]){
                    continue;
                }
                queue.offer(new Tomato(row, col));
                visited[row][col]=true;
                map[row][col] = map[temp.x][temp.y]+1;
            }
        }
    }
    /* ==========search========== */
    static boolean search(){
        boolean exist=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==0)
                    exist=true;
                max=Math.max(max, map[i][j]);
            }
        }
        return exist;
    }
}
