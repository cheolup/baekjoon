// BOJ_13458_시험 감독

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13458 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i]= Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        long result =0;
        for(int i=0;i<N;i++){
            int temp =A[i];
            result++;
            if (temp > B) {
                temp -= B;
                result += temp / C;
                if (temp % C != 0) {
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}