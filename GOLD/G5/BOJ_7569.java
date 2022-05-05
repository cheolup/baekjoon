// BOJ_7569_토마토

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7569 {
    static int N, M, H, max;
    static int[][][] map;
    static boolean[][][] visited;
    static List<Tomato> tomatos;
    static int[] dx = {-1, 0, 1, 0, 0, 0};
    static int[] dy = {0, 1, 0, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static class Tomato {
        int z;
        int x;
        int y;
        Tomato(int z, int x, int y) {
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map = new int[H][N][M];
        visited = new boolean[H][N][M];
        tomatos = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());
                    if (map[i][j][k] == 1) {
                        tomatos.add(new Tomato(i, j, k));
                    }
                }
            }
        }
        /* ==========sol========== */
        if (!search()) {
            System.out.println(0);
            System.exit(0);
        }
        bfs();
        /* ==========output========== */
        if (search()) {
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(max - 1);
        br.close();
    }
    /* ==========bfs========== */
    static void bfs() {
        Queue<Tomato> queue = new LinkedList<>();
        for (Tomato init : tomatos) {
            queue.offer(init);
            visited[init.z][init.x][init.y] = true;
        }
        while (!queue.isEmpty()) {
            Tomato temp = queue.poll();
            for (int dir = 0; dir < 6; dir++) {
                int floor = temp.z + dz[dir];
                int row = temp.x + dx[dir];
                int col = temp.y + dy[dir];
                if (row < 0 || row >= N || col < 0 || col >= M || floor < 0 || floor >= H || map[floor][row][col] == -1
                        || visited[floor][row][col]) {
                    continue;
                }
                queue.offer(new Tomato(floor, row, col));
                visited[floor][row][col] = true;
                map[floor][row][col] = map[temp.z][temp.x][temp.y] + 1;
            }
        }
    }
    /* ==========search========== */
    static boolean search() {
        boolean exist = false;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    max = Math.max(max, map[i][j][k]);
                    if (map[i][j][k] == 0) {
                        exist = true;
                    }
                }
            }
        }
        return exist;
    }
}
