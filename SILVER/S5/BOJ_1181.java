// BOJ_1181_단어 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++)
            str[i] = br.readLine();
        /* ==========sol========== */
        Arrays.sort(str);
        Arrays.sort(str, Comparator.comparingInt(String::length));
        /* ==========output========== */
        System.out.println(str[0]);
        for (int i = 0; i < N - 1; i++)
            if (!str[i].equals(str[i + 1])) {
                System.out.println(str[i + 1]);
            }
        br.close();
    }
}
