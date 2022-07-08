// BOJ_1120_문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1120 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        /* ==========sol========== */
        int numA= A.length();
        int numB= B.length();
        int result=Integer.MAX_VALUE;
        for(int i=0;i<=numB-numA;i++){
            int count=0;
            for(int j=i;j<i+numA;j++){
                if(A.charAt(j-i)!=B.charAt(j)){
                    count++;
                }
            }
            result=Math.min(result,count);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
