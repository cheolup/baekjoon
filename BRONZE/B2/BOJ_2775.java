// BOJ_2775_부녀회장이 될테야

import java.io.*;

public class BOJ_2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			/* ==========input========== */
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			/* ==========sol========== */
			/* ==========output========== */
			System.out.println(sum(k, n));
		}
		br.close();
	}
	/* ==========sum========== */
	static int sum(int k, int n) {
		int result = 0;
		if (n == 0)
			result = 0;
		else if (k == 0)
			result = n;
		else
			result = sum(k - 1, n) + sum(k, n - 1);
		return result;
	}
}
