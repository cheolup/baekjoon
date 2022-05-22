// BOJ_2480_주사위 세개

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2480 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		if(A==B&&B==C){
			System.out.println(10000+1000*A);
		}else if(A==B){
			System.out.println(1000+100*A);
		}else if(A==C){
			System.out.println(1000+100*A);
		}else if(B==C){
			System.out.println(1000+100*B);
		}else {
			System.out.println(100*Math.max(A,Math.max(B,C)));
		}
		br.close();
	}
}
