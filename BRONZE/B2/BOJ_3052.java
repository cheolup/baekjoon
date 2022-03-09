// BOJ_3052_나머지

import java.io.*;

public class BOJ_3052 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10];
		for(int i=0; i<10;i++) 
			arr[i]=Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int m[] = new int[42];
		int count = 0;
		for (int i = 0; i < 10; i++) 
			m[arr[i] % 42]++;
		for (int i = 0; i < 42; i++) 
			if (m[i] > 0) 
				count++;
		/* ==========output========== */
		System.out.println(count);
		br.close();
	}
}
