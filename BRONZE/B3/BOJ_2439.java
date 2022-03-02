// BOJ_2439_별 찍기 - 2

import java.io.*;

public class BOJ_2439 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		for (int i = 1; i <= N; i++) {
			for (int j = N - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		br.close();
	}
}
