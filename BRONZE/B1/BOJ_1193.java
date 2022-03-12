// BOJ_1193_분수찾기

import java.io.*;

public class BOJ_1193 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int i = 0;
		while (true) {
			if ((N) <= (i * i + i) / 2) {
				i++;
				break;
			}
			i++;
		}
		int seq = N - ((i - 2) * (i - 2) + (i - 2)) / 2;
		/* ==========output========== */
		if (i % 2 == 0)
			System.out.println((i - seq) + "/" + seq);
		else
			System.out.println(seq + "/" + (i - seq));
		br.close();
	}
}
