// BOJ_2563_색종이

import java.util.*;
import java.io.*;

public class BOJ_2563 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		boolean[][] map = new boolean[100][100];
		for (int p = 0; p < n; p++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++)
					map[x + i][y + j] = true;
		}
		/* ==========sol========== */
		int result = 0;
		for (int i = 0; i < 100; i++)
			for (int j = 0; j < 100; j++)
				if (map[i][j] == true)
					result++;
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
