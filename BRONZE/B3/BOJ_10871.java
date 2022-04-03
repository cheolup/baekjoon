// BOJ_10871_X보다 작은 수

import java.util.*;
import java.io.*;

public class BOJ_10871 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int[] a = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if (a[i] < X) {
				System.out.print(a[i] + " ");
			}
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
