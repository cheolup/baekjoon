// BOJ_10817_세 수

import java.util.*;
import java.io.*;

public class BOJ_10817 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		Arrays.sort(arr);
		/* ==========output========== */
		System.out.println(arr[1]);
		br.close();
	}
}
