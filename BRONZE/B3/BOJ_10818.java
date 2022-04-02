// BOJ_10818_최소, 최대

import java.util.*;
import java.io.*;

public class BOJ_10818 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		Arrays.sort(arr);
		/* ==========output========== */
		System.out.println(arr[0] + " " + arr[N - 1]);
		br.close();
	}
}
