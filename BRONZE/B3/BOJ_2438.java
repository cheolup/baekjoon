// BOJ_2438_별 찍기 - 1

import java.io.*;

public class BOJ_2438 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		br.close();
	}
}
