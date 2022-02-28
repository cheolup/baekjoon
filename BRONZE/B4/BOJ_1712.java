// BOJ_1712_손익분기점

import java.util.*;
import java.io.*;

public class BOJ_1712 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		if (B >= C)
			System.out.println(-1);
		else
			System.out.println(A / (C - B) + 1);
		br.close();
	}
}
