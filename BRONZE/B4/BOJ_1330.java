// BOJ_1330_두 수 비교하기

import java.util.*;
import java.io.*;

public class BOJ_1330 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		if (A > B)
			System.out.println(">");
		else if (A < B)
			System.out.println("<");
		else
			System.out.println("==");
		br.close();
	}
}
