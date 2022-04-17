// BOJ_11501_주식

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < T; testCase++) {
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] chart = new int[N];
            for (int i = 0; i < N; i++)
                chart[i] = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            long result = 0;
            int max = 0;
            for(int i = N-1;i>=0;i--){
                if(chart[i]>max)
                    max = chart[i];
                else
                    result += max-chart[i];
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}
