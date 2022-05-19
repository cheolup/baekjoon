// BOJ_1011_Fly me to the Alpha Centauri

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int dis =y-x;
            int max = (int)Math.sqrt(dis);
            /* ==========output========== */
            if(max==Math.sqrt(dis)){
                System.out.println(2*max-1);
            }else if(dis<=max*max+max){
                System.out.println(2*max);
            }else {
                System.out.println(2*max+1);
            }
        }
        br.close();
    }
}
