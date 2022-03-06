// BOJ_2577_숫자의 개수

import java.io.*;

public class BOJ_2577 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int result = A * B * C;
		String str = Integer.toString(result);
		/* ==========output========== */
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++)
				if ((str.charAt(j) - '0') == i)
					count++;
			System.out.println(count);
		}
		br.close();
	}
}
