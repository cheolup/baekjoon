// BOJ_2562_최댓값

import java.io.*;

public class BOJ_2562 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		/* ==========sol========== */
		int max = 1;
		int index = -1;
		for (int i = 0; i < 9; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		/* ==========output========== */
		System.out.println(arr[index]);
		System.out.println(index + 1);
		br.close();
	}
}
