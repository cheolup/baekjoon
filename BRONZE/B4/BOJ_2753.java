// BOJ_2753_윤년

import java.io.*;

public class BOJ_2753 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		if (((A % 4) == 0 && !((A % 100) == 0)) || (A % 400) == 0)
			System.out.println("1");
		else
			System.out.println("0");
		br.close();
	}
}
