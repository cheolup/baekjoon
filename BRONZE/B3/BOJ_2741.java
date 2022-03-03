// BOJ_2741_N 찍기

import java.io.*;

public class BOJ_2741 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		for (int i = 1; i <= N; i++)
			System.out.println(i);
		br.close();
	}
}
