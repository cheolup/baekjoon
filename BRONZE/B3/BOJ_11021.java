// BOJ_11021_A+B - 7

import java.util.*;
import java.io.*;

public class BOJ_11021 {
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
			System.out.println("Case #" + test_case + ": " + (A + B));
		}
		br.close();
	}
}
