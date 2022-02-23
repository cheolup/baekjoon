// BOJ_1000_A+B

import java.util.*;
import java.io.*;

public class BOJ_1000 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(A + B);
		br.close();
	}
}
