// BOJ_2908_상수

import java.util.*;
import java.io.*;

public class BOJ_2908 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		A = A % 10 * 100 + ((A % 100) / 10) * 10 + (A / 100);
		B = B % 10 * 100 + ((B % 100) / 10) * 10 + (B / 100);
		/* ==========output========== */
		if(A>=B)
			System.out.println(A);
		else
			System.out.println(B);
		
		br.close();
	}
}
