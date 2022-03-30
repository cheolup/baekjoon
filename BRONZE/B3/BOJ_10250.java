// BOJ_10250_ACM 호텔

import java.util.*;
import java.io.*;

public class BOJ_10250 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			st.nextToken(); // int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			int Y, X;
			if (N % H == 0) {
				Y = H * 100;
				X = N / H;
			} else {
				Y = (N % H) * 100;
				X = N / H + 1;
			}
			/* ==========output========== */
			System.out.println(Y + X);
		}
		br.close();
	}
}
