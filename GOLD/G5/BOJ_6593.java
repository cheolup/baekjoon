// BOJ_6593_상범 빌딩

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_6593 {
    static int[][][] map;
    static boolean[][][] visited;
    static int L, R, C;
    static int exitL, exitR, exitC;
    static Room startRoom;
    static int[] dz = { 0, 0, 0, 0, 1, -1 };
    static int[] dx = { 0, 0, 1, -1, 0, 0 };
    static int[] dy = { 1, -1, 0, 0, 0, 0 };
    static class Room {
        int z, x, y;
        Room(int z, int x, int y) {
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            if (L == 0 && R == 0 && C == 0)
                break;
            map = new int[L][R][C];
            visited = new boolean[L][R][C];
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < R; j++) {
                    String str = br.readLine();
                    for (int k = 0; k < C; k++) {
                        char temp = str.charAt(k);
                        if (temp != '#') {
                            map[i][j][k] = 1;
                            if (temp == 'S') {
                                startRoom = new Room(i, j, k);
                            } else if (temp == 'E') {
                                exitL = i;
                                exitR = j;
                                exitC = k;
                            }
                        }
                    }
                }
                br.readLine();
            }
            /* ==========sol========== */
            bfs(startRoom);
            int result =  map[exitL][exitR][exitC]-1;
            /* ==========output========== */
            if(result!=0){
                System.out.println("Escaped in "+ result+" minute(s).");
            } else{
                System.out.println("Trapped!");
            }
        }
        br.close();
    }
    /* ==========bfs========== */
    public static void bfs(Room room) {
        Queue<Room> queue = new LinkedList<>();
        queue.offer(room);
        visited[room.z][room.x][room.y] = true;
        while (!queue.isEmpty()) {
            Room temp = queue.poll();
            int z = temp.z;
            int x = temp.x;
            int y = temp.y;
            if (z == exitL && x == exitR && y == exitC)
                break;
            for (int dir = 0; dir < 6; dir++) {
                int nextZ = z + dz[dir];
                int nextX = x + dx[dir];
                int nextY = y + dy[dir];
                if (nextZ < 0 || nextZ >= L || nextX < 0 || nextX >= R || nextY < 0 || nextY >= C
                        || visited[nextZ][nextX][nextY])
                    continue;

                if (map[nextZ][nextX][nextY] == 1) {
                    visited[nextZ][nextX][nextY] = true;
                    map[nextZ][nextX][nextY] = map[z][x][y] + 1;
                    queue.offer(new Room(nextZ, nextX, nextY));
                }
            }

        }
    }
}