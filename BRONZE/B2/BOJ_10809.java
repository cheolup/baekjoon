// BOJ_10809_알파벳 찾기

import java.io.*;

public class BOJ_10809 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		int arr[] = new int[26];
		for (int i = 0; i < 26; i++)
			arr[i] = -1;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (arr[c - 'a'] == -1)
				arr[c - 'a'] = i;
		}
		/* ==========output========== */
		for (int i = 0; i < 26; i++)
			System.out.print(arr[i] + " ");
		br.close();
	}
}