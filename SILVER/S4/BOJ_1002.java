// BOJ_1002_터렛

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int test_case=1;test_case<=T;test_case++){
			/* ==========sol========== */
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			/* ==========output========== */
			double dis = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
			/* ==========input========== */
			if(dis>r1+r2){
				System.out.println(0);
			}else if(dis==r1+r2){
				System.out.println(1);
			}else {
				if(x1==x2&&y1==y2&&r1==r2){
					System.out.println(-1);
				}else if(dis+Math.min(r1,r2)==Math.max(r1,r2)){
					System.out.println(1);
				}else if(dis+Math.min(r1,r2)<Math.max(r1,r2)){
					System.out.println(0);
				}else {
					System.out.println(2);
				}
			}
		}
		br.close();
	}
}
