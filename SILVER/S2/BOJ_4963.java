// BOJ_4963_섬의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4963 {
    static int[][] map;
    static int w, h, result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) {
                break;
            }
            map = new int[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            /* ==========sol========== */
            result=0;
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    if(dfs(i,j))
                        result++;
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    /* ==========dfs========== */
    static boolean dfs(int height, int width) {
        if (height < 0 || height >= h || width < 0 || width >= w)
            return false;
        if (map[height][width] == 1) {
            map[height][width] = 0;
            dfs(height-1,width);
            dfs(height-1,width+1);
            dfs(height,width+1);
            dfs(height+1,width+1);
            dfs(height+1,width);
            dfs(height+1,width-1);
            dfs(height,width-1);
            dfs(height-1,width-1);
            return true;
        }
        return false;
    }
}
