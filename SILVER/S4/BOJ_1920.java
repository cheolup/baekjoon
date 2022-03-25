// BOJ_1920_수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1920 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            B[i] = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        Arrays.sort(A);
        /* ==========output========== */
        for (int i = 0; i < M; i++) {
            boolean find = false;
            int start = 0;
            int end = N - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (A[mid] == B[i]) {
                    find = true;
                    break;
                } else if (A[mid] > B[i])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            System.out.println(find ? 1 : 0);
        }
        br.close();
    }
}