// BOJ_2309_일곱 난쟁이

import java.util.*;
import java.io.*;

public class BOJ_2309 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] key = new int[9];
		int total = 0;
		for (int i = 0; i < 9; i++) {
			key[i] = Integer.parseInt(br.readLine());
			total += key[i];
		}
		/* ==========sol========== */
		Arrays.sort(key);
		Loop: for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if ((total - key[i] - key[j]) == 100) {
					key[i] = 0;
					key[j] = 0;
					break Loop;
				}
			}
		}
		/* ==========output========== */
		for (int i = 0; i < 9; i++)
			if (key[i] != 0)
				System.out.println(key[i]);
		br.close();
	}
}
