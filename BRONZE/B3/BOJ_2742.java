// BOJ_2742_기찍 N

import java.io.*;

public class BOJ_2742 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		for (int i = N; i >= 1; i--)
			System.out.println(i);
		br.close();
	}
}
