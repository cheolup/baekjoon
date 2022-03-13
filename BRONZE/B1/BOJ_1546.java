// BOJ_1546_평균

import java.util.*;
import java.io.*;

public class BOJ_1546 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double arr[] = new double[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		Arrays.sort(arr);
		double avg = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = arr[i] / arr[N - 1] * 100;
			avg += arr[i];
		}
		avg = avg / N;
		/* ==========output========== */
		System.out.println(avg);
		br.close();
	}
}
