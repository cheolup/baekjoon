// BOJ_9498_시험 성적

import java.io.*;

public class BOJ_9498 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		if (A <= 100 && A >= 90)
			System.out.println("A");
		else if (A >= 80)
			System.out.println("B");
		else if (A >= 70)
			System.out.println("C");
		else if (A >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		br.close();
	}
}
