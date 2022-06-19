// BOJ_10867_중복 빼고 정렬하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_10867 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
                num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(num[i]);
        }
        /* ==========output========== */
        ArrayList<Integer> list = new ArrayList(set);
        Collections.sort(list);
        for (int s :list) {
            System.out.print(s + " ");
        }
        br.close();
    }
}
