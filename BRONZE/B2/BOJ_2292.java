// BOJ_2292_벌집

import java.io.*;

public class BOJ_2292 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int i = 0;
		while (true) {
			if ((N - 1) <= (3 * i * i + 3 * i)) {
				i++;
				break;
			}
			i++;
		}
		/* ==========output========== */
		System.out.println(i);
		br.close();
	}
}
