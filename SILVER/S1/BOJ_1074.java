// BOJ_1074_Z

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1074 {
    static int N, r, c, result;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int size = (int) Math.pow(2, N);
        result = 0;
        recur(size,r,c);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    /* ==========recur========== */
    static void recur(int size, int r, int c) {
        if (size == 1) return;
        if (r < size / 2 && c < size / 2) {
            recur(size / 2, r, c);
        } else if (r < size / 2 && size / 2 <= c) {
            result += size * size / 4;
            recur(size / 2, r, c - size / 2);
        }else if (size / 2 <= r&& c < size / 2) {
            result += (size * size / 4)*2;
            recur(size / 2, r - size / 2, c);
        }else if (size / 2 <= r && size / 2 <= c) {
            result += (size * size / 4)*3;
            recur(size / 2, r - size / 2, c - size / 2);
        }
    }
}
