// BOJ_10950_A+B - 3

import java.util.*;
import java.io.*;

public class BOJ_10950 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			/* ==========input========== */
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			System.out.println(A + B);
		}
		br.close();
	}
}
