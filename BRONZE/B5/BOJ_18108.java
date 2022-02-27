// BOJ_18108_1998년생인 내가 태국에서는 2541년생?!

import java.io.*;

public class BOJ_18108 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(A - 543);
		br.close();
	}
}
