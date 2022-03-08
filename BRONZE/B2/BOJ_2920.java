// BOJ_2920_음계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2920 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] tune = new int[8];
        for (int i = 0; i < 8; i++) {
            tune[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        boolean asc = true;
        boolean des = true;
        for (int i = 0; i < 8; i++)
            if (!(tune[i] == i + 1)) {
                asc = false;
                break;
            }
        for (int i = 0; i < 8; i++)
            if (!(tune[i] == 8 - i)) {
                des = false;
                break;
            }
        /* ==========output========== */
        if (asc) System.out.println("ascending");
        else if (des) System.out.println("descending");
        else System.out.println("mixed");
        br.close();
    }
}
