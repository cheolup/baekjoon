// BOJ_1157_단어 공부

import java.io.*;

public class BOJ_1157 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		/* ==========sol========== */
		int arr[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			arr[c - 'A']++;
		}
		int max = 0;
		int index = -1;
		char result;
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				index = i;
				max = arr[index];
			}
		}
		result = (char) (index + 'A');
		for (int i = 0; i < 26; i++) {
			if (i != index && arr[i] == arr[index]) {
				result = '?';
				break;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
