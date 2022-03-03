// BOJ_2739_구구단

import java.io.*;

public class BOJ_2739 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		for (int i = 1; i < 10; i++)
			System.out.println(N + " * " + i + " = " + N * i);
		br.close();
	}
}
