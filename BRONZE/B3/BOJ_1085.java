// BOJ_1085_직사각형에서 탈출

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1085 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int min = x;
        min = Math.min(min, y);
        min = Math.min(min, w - x);
        min = Math.min(min, h - y);
        /* ==========output========== */
        System.out.println(min);
        br.close();
    }
}