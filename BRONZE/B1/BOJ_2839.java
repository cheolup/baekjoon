// BOJ_2839_설탕 배달

import java.util.*;
import java.io.*;

public class BOJ_2839 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int result = 0;
		while (true) {
			if (N % 5 == 0) {
				result += N / 5;
				break;
			} else {
				N -= 3;
				result++;
			}
			if (N < 0) {
				result = -1;
				break;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}