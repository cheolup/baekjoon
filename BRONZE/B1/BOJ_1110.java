// BOJ_1110_더하기 사이클

import java.io.*;

public class BOJ_1110 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int count = 0;
		int next = -1;
		int a0, a1, mid;
		a0 = N / 10;
		a1 = N % 10;
		mid = a0 + a1;
		while (N != next) {
			if (mid < 10)
				next = 10 * a1 + mid;
			else
				next = 10 * a1 + mid % 10;
			a0 = next / 10;
			a1 = next % 10;
			mid = a0 + a1;
			count++;
		}
		/* ==========output========== */
		System.out.println(count);
		br.close();
	}
}
