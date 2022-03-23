// BOJ_1620_나는야 포켓몬 마스터 이다솜

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[N + 1];
        for (int i = 1; i <= N; i++) {
            String temp = br.readLine();
            map.put(temp, i);
            arr[i] = temp;
        }
        /* ==========sol========== */
        String str = "";
        int num = 0;
        /* ==========output========== */
        for (int i = 0; i < M; i++) {
            try {
                str = br.readLine();
                num = Integer.parseInt(str);
                System.out.println(arr[num]);
            } catch (NumberFormatException e) {
                System.out.println(map.get(str));
            }
        }
        br.close();
    }
}
