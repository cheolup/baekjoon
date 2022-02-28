// BOJ_2588_곱셈

import java.io.*;

public class BOJ_2588 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int C = A * (B % 10);
		B /= 10;
		int D = A * (B % 10);
		B /= 10;
		int E = A * (B % 10);
		/* ==========output========== */
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(C + D * 10 + E * 100);
		br.close();
	}
}
