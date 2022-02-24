// BOJ_8393_합

import java.io.*;

public class BOJ_8393 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		/* ==========output========== */
		System.out.println(sum);
		br.close();
	}
}
