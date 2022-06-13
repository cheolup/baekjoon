// BOJ_1113_수영장 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1113 {
    static int N, M, max, result;
    static boolean flag;
    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        max = -1;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
                if(map[i][j]>max) max = map[i][j];
            }
        }
        result = 0;
        /* ==========sol========== */
        for (int h = 1; h <= max; h++) {
            for (int i = 1; i < N - 1; i++) {
                for (int j = 1; j < M - 1; j++) {
                    if (map[i][j] < h) {
                        result += surround(i, j, h);
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    /* ==========surround========== */
    static int surround(int x, int y, int value) {
        int count = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        map[x][y]++;
        flag=false;
        while (!queue.isEmpty()) {
            Node now = queue.poll();
            for (int d = 0; d < 4; d++) {
                int r = now.x + dx[d];
                int c = now.y + dy[d];
                if (r < 0 || r > N - 1 || c < 0 || c > M - 1) {
                    flag = true;
                    continue;
                }
                if (value > map[r][c]) {
                    map[r][c]++;
                    queue.add(new Node(r, c));
                    count++;
                }
            }
        }
        if (flag) count = 0;
        return count;
    }
}