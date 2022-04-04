// BOJ_10951_A+B - 4

import java.util.*;
import java.io.*;

public class BOJ_10951 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while ((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			System.out.println(A + B);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
