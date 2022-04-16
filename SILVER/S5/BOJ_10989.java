// BOJ_10989_수 정렬하기 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i]=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++)
            sb.append(arr[i]).append("\n");
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
