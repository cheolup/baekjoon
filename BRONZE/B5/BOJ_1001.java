// BOJ_1001_A-B

import java.util.*;
import java.io.*;

public class BOJ_1001 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(A - B);
		br.close();
	}
}
