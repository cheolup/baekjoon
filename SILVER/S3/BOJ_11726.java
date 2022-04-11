// BOJ_11726_2×n 타일링

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int[] num = new int[1001];
        num[1]=1;
        num[2]=2;
        for(int i=3;i<=N;i++)
            num[i]=(num[i-1]+num[i-2])%10007;
        /* ==========output========== */
        System.out.println(num[N]);
        br.close();
    }
}
