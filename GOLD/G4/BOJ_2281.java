// BOJ_2281_데스노트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2281 {
    static int n,m;
    static int[] num;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        dp=new int[1000][1002];
        for(int i=0; i<dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        /* ==========output========== */
        System.out.println(check(1,num[0]+1));
        br.close();
    }
    static int check(int count,int len){
        if(count==n){
            return  0;
        }
        int ans = dp[count][len];
        if(ans != -1) return ans;
        int left = m - len + 1;
        ans = check(count+1, num[count]+1) + (left * left);
        if(len + num[count] <= m) {
            ans = Math.min(check(count+1, len + num[count] + 1), ans);
        }
        dp[count][len] = ans;
        return ans;
    }
}
