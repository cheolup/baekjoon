// BOJ_15552_빠른 A+B

import java.util.*;
import java.io.*;

public class BOJ_15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int test_case = 1; test_case <= T; test_case++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
			/* ==========sol========== */
			/* ==========output========== */
		}
		bw.flush(); // 반드시 flush() or close() 를 반드시 호출
		bw.close();
		br.close();
	}
}