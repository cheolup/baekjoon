// BOJ_24416_알고리즘 수업 - 피보나치 수 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24416 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int[] dp =new int[N+1];
		dp[1]=1;
		dp[2]=1;
		for(int i=3;i<=N;i++){
			dp[i]=dp[i-1]+dp[i-2];
		}
		/* ==========output========== */
		System.out.print(dp[N]+" "+ (N-2));
		br.close();
	}
}
