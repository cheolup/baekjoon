// BOJ_2440_별 찍기 - 3

import java.io.*;

public class BOJ_2440 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		for (int i = N; i > 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		br.close();
	}
}
