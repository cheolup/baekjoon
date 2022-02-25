// BOJ_10757_큰 수 A+B

import java.util.*;
import java.io.*;

public class BOJ_10757 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		/* ==========sol========== */
		int len;
		if (A.length() > B.length())
			len = A.length();
		else
			len = B.length();

		int[] arrA = new int[len + 1];
		int[] arrB = new int[len + 1];
		for (int i = 0; i < A.length(); i++)
			arrA[i] = A.charAt(A.length() - 1 - i) - '0';
		for (int i = 0; i < B.length(); i++)
			arrB[i] = B.charAt(B.length() - 1 - i) - '0';

		int carry = 0;
		for (int i = 0; i < len; i++) {
			if ((arrA[i] + arrB[i] + carry) >= 10) {
				arrA[i] = (arrA[i] + arrB[i] + carry) % 10;
				carry = 1;
			} else {
				arrA[i] = arrA[i] + arrB[i] + carry;
				carry = 0;
			}
		}
		/* ==========output========== */
		if (carry == 1) {
			arrA[len] = 1;
			for (int i = 0; i < len + 1; i++) {
				arrB[i] = arrA[len - i];
			}
			for (int i = 0; i < len + 1; i++) {
				System.out.print(arrB[i]);
			}

		} else {
			for (int i = 0; i < len; i++) {
				arrB[i] = arrA[len - 1 - i];
			}
			for (int i = 0; i < len; i++) {
				System.out.print(arrB[i]);
			}
		}
		br.close();
	}
}
