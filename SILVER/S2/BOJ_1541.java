// BOJ_1541_잃어버린 괄호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1541 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        /* ==========sol========== */
        StringTokenizer st = new StringTokenizer(str,"-");
        String[] start = st.nextToken().split("\\+");
        int sum=0;
        for (String s : start) {
            sum += Integer.parseInt(s);
        }
        while(st.hasMoreTokens()){
            String[] arr=st.nextToken().split("\\+");
            int temp=0;
            for (String s : arr) {
                temp += Integer.parseInt(s);
            }
            sum-=temp;
        }
        /* ==========output========== */
        System.out.println(sum);
        br.close();
    }
}
