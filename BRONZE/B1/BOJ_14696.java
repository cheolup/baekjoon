// BOJ_14696_딱지놀이

import java.util.*;
import java.io.*;

public class BOJ_14696 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			/* ==========input========== */
			int[] count = new int[5];
			StringTokenizer st = new StringTokenizer(br.readLine());
			int size = Integer.parseInt(st.nextToken());
			for (int j = 0; j < size; j++)
				count[Integer.parseInt(st.nextToken())]++;
			st = new StringTokenizer(br.readLine());
			size = Integer.parseInt(st.nextToken());
			for (int j = 0; j < size; j++)
				count[Integer.parseInt(st.nextToken())]--;
			/* ==========sol========== */
			char winner = 'D';
			for (int j = 4; j > 0; j--) {
				if (count[j] == 0)
					continue;
				else if (count[j] > 0) {
					winner = 'A';
					break;
				} else {
					winner = 'B';
					break;
				}
			}
			/* ==========output========== */
			System.out.println(winner);
		}
		br.close();
	}
}
