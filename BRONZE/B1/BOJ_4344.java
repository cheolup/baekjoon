// BOJ_2675_문자열 반복

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2675__123 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			/* ==========input========== */
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken().trim();
			/* ==========sol========== */
			/* ==========output========== */
			for (int i = 0; i < S.length(); i++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(i));
				}
			}
			System.out.println();
		}
		br.close();
	}
}
