// BOJ_10952_A+B - 5

import java.util.*;
import java.io.*;

public class BOJ_10952 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if (A == 0 && B == 0)
				break;
			System.out.println(A + B);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}