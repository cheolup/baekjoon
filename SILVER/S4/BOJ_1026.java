// BOJ_1758_보물

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1026 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            B[i]=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        Arrays.sort(A);
        Arrays.sort(B);
        int result=0;
        for(int i = 0; i<N;i++)
            result+=A[i]*B[N-1-i];
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
