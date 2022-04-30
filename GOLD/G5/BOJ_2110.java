// BOJ_2110_공유기 설치

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2110 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] home = new int[N];
        for (int i = 0; i < N; i++)
            home[i] = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        Arrays.sort(home);
        int start = 1;
        int end = home[N - 1];
        int max = 0;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            int temp = home[0];
            int count = 1;
            for (int i = 1; i < N; i++) {
                if (home[i] - temp >= mid) {
                    count++;
                    temp = home[i];
                }
            }
            if (count >= C) {
                max = Math.max(max, mid);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        /* ==========output========== */
        System.out.println(max);
        br.close();
    }
}
