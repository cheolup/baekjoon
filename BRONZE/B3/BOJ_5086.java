// BOJ_5086_배수와 약수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true){
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			if(a==0&&b==0) break;
			/* ==========output========== */
			if(b%a==0){
				System.out.println("factor");
			}else if(a%b==0){
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}
		}
		br.close();
	}
}
