// BOJ_5622_다이얼

import java.io.*;

public class BOJ_5622 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		int sum = 0;
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 'A' && c <= 'C')
				sum += 3;
			else if (c >= 'D' && c <= 'F')
				sum += 4;
			else if (c >= 'G' && c <= 'I')
				sum += 5;
			else if (c >= 'J' && c <= 'L')
				sum += 6;
			else if (c >= 'M' && c <= 'O')
				sum += 7;
			else if (c >= 'P' && c <= 'S')
				sum += 8;
			else if (c >= 'T' && c <= 'V')
				sum += 9;
			else if (c >= 'W' && c <= 'Z')
				sum += 10;
		}
		/* ==========output========== */
		System.out.println(sum);
		br.close();
	}
}
