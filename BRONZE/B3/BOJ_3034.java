// BOJ_3034_앵그리 창영

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3034 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		/* ==========sol========== */
		/* ==========output========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		for (int i = 0; i <N; i++) {
			int temp =Integer.parseInt(br.readLine());
			if(temp*temp<=W*W+H*H){
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}
		br.close();
	}
}
