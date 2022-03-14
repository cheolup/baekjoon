// BOJ_2750_수 정렬하기

import java.util.*;
import java.io.*;

public class BOJ_2750 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		Arrays.sort(arr);
		/* ==========output========== */
		for (int i = 0; i < N; i++)
			System.out.println(arr[i]);
		br.close();
	}
}
