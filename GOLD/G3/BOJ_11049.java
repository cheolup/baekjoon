// BOJ_11049_행렬 곱셈 순서

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_11049 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int r=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            arr[i]=r;
            arr[i+1]=c;

        }
        /* ==========sol========== */
        int [][] dp = new int[N][N];
        for(int i=2;i<N+1;i++){
            for(int j=0;j<N-i+1;j++){
                dp[j][j+i-1]=Integer.MAX_VALUE;
                for(int k=j;k<j+i-1;k++){
                    int val = dp[j][k]+dp[k+1][j+i-1] + arr[j]*arr[k+1]*arr[j+i];
                    dp[j][j+i-1]=Math.min(dp[j][j+i-1],val);
                }
            }
        }
        /* ==========output========== */
        System.out.println(dp[0][N-1]);
        br.close();
    }
}
