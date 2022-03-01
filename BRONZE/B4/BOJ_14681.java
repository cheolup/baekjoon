// BOJ_14681_사분면 고르기

import java.io.*;

public class BOJ_14681 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		if (A > 0 && B > 0)
			System.out.println("1");
		else if (A < 0 && B > 0)
			System.out.println("2");
		else if (A < 0 && B < 0)
			System.out.println("3");
		else
			System.out.println("4");
		br.close();
	}
}
