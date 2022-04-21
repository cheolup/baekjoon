// BOJ_1263_시간 관리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1263 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N];
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            st= new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            S[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (S[i] < S[j]) {
                    int tmp = S[i];
                    S[i] = S[j];
                    S[j] = tmp;
                    tmp = T[i];
                    T[i] = T[j];
                    T[j] = tmp;
                }
            }
        }
        int dif = S[0] - T[0];
        for (int i = 1; i < N; i++) {
            if (dif > S[i]) {
                dif = S[i] - T[i];
            } else {
                dif -= T[i];
            }
        }
        /* ==========output========== */
        if (dif > 0)
            System.out.println(dif);
        else
            System.out.println("-1");
        br.close();
    }
}
