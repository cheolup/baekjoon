// BOJ_10942_팰린드롬?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10942 {
    static int N;
    static int[] num;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        num = new int[N+1];
        dp= new int[N+1][N+1];
        st= new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++)
            num[i]=Integer.parseInt(st.nextToken());
        check();
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            st= new StringTokenizer(br.readLine());
            int S=Integer.parseInt(st.nextToken());
            int E=Integer.parseInt(st.nextToken());
            sb.append(dp[S][E]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    static void check(){
        for(int i = 1; i <= N; i++)
            dp[i][i] = 1;

        for(int i = 1; i <= N - 1; i++)
            if(num[i] == num[i + 1]) dp[i][i + 1]= 1;

        for(int i = 2; i < N; i++){
            for(int j = 1; j <= N - i; j++){
                if(num[j] == num[j + i] && dp[j + 1][j + i - 1]==1)
                    dp[j][j + i] = 1;
            }
        }
    }
}
