// BOJ_2884_팩토리얼

import java.io.*;

public class BOJ_10872 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(fac(N));
		br.close();
	}

	/* ==========fac========== */
	static int fac(int N) {
		if (N <= 1)
			return 1;
		else
			return fac(N - 1) * N;
	}
}
