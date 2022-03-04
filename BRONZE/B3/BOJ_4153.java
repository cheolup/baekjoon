// BOJ_4153_직각삼각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            /* ==========input========== */
            int[] num = new int[3];
            st = new StringTokenizer(br.readLine());
            int N0 = Integer.parseInt(st.nextToken());
            int N1 = Integer.parseInt(st.nextToken());
            int N2 = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            if (N0 == 0 && N1 == 0 && N2 == 0) break;
            num[0] = N0;
            num[1] = N1;
            num[2] = N2;
            Arrays.sort(num);
            /* ==========output========== */
            if (num[2] * num[2] == (num[0] * num[0]) + (num[1] * num[1]))
                System.out.println("right");
            else
                System.out.println("wrong");
        }
        br.close();
    }
}
