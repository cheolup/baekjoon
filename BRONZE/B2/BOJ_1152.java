// BOJ_1152_단어의 개수

import java.io.*;

public class BOJ_1152 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine().trim();
		String[] arr = S.split(" ");
		/* ==========sol========== */
		/* ==========output========== */
		if (arr[0] == "")
			System.out.println("0");
		else
			System.out.println(arr.length);
		br.close();
	}
}
