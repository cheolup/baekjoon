// BOJ_1978_소수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        for (int i = 0; i < N; i++)
            if (prime(arr[i]))
                result++;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    /* ==========prime========== */
    static boolean prime(int n) {
        int count = 0;
        boolean isPrime = false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
            if (count == 2)
                isPrime = true;
            if (count > 2)
                isPrime = false;
        }
        return isPrime;
    }
}