// BOJ_2884_알람 시계

import java.util.*;
import java.io.*;

public class BOJ_2884 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		if (B - 45 < 0 && A - 1 < 0)
			System.out.print(A + 23 + " " + (B + 15));
		else if (B - 45 < 0)
			System.out.print(A - 1 + " " + (B + 15));
		else
			System.out.print(A + " " + (B - 45));
		br.close();
	}
}
