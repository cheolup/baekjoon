// BOJ_1072_게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1072 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        /* ==========sol========== */
        long Z = 100 * Y / X;
        long start = 1;
        long end = X;
        long mid;
        while (start <= end) {
            mid = (start + end) / 2;
            long temp = 100 * (Y + mid) / (X + mid);
            if (temp > Z)
                end = mid - 1;
            else
                start = mid + 1;
        }
        /* ==========output========== */
        if (Z >= 99)
            System.out.println(-1);
        else
            System.out.println(start);
        br.close();
    }
}
