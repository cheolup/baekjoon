// BOJ_14241_슬라임 합치기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_14241 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(arr);
        int result = 0;
        for (int i = N - 1; i > 0; i--) {
            result += arr[i] * arr[i - 1];
            arr[i - 1] = arr[i] + arr[i - 1];
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
