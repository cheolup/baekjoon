// BOJ_10870_피보나치 수 5

import java.io.*;

public class BOJ_10870 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(fib(n));
		br.close();
	}
	/* ==========fib========== */
	static int fib(int n){
		if(n<=1)
			return n;
		 else
			return fib(n-1)+fib(n-2);
	}
}
