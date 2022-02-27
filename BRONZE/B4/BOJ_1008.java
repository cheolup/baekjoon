// BOJ_1008_A/B

import java.util.*;
import java.io.*;

public class BOJ_1008 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(A / B);
		br.close();
	}
}
