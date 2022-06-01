// BOJ_2477_참외밭

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_2477 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int max=0;
        int sum=0;
        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int first=Integer.parseInt(st.nextToken());
        int pre =first;
        for(int i=1;i<6;i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            int len=Integer.parseInt(st.nextToken());
            max= Math.max(len*pre,max);
            sum+=len*pre;
            pre = len;
        }
        max=Math.max(first*pre, max);
        sum +=first*pre;
        int result =(max-((max*3)-sum))*N;
        System.out.println(result);
        br.close();
    }
}
