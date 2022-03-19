// BOJ_2751_수 정렬하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_2751 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(br.readLine()));
        /* ==========sol========== */
        Collections.sort(list);
        /* ==========output========== */
        for (int i = 0; i < N; i++)
            sb.append(list.get(i)).append('\n');
        System.out.println(sb);
        br.close();
    }
}
