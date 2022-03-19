// BOJ_2828_사과 담기 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2828 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken(); // int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int J = Integer.parseInt(br.readLine());
		int[] apple = new int[J];
		int move = 0;
		int x = 1;
		for (int i = 0; i < J; i++) {
			apple[i] = Integer.parseInt(br.readLine());
			if (apple[i] < x) {
				move += x - apple[i];
				x = apple[i];
			} else if (apple[i] > (x + M - 1)) {
				move += apple[i] - (x + M - 1);
				x = apple[i] - M + 1;
			}
		}
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(move);
		br.close();
	}
}
