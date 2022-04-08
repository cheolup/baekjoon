// BOJ_9375_패션왕 신해빈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int n=Integer.parseInt(br.readLine());
            HashMap<String,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String temp = st.nextToken();
                if(map.containsKey(temp))
                    map.put(temp,map.get(temp)+1);
                else
                    map.put(temp,1);
            }
            /* ==========sol========== */
            int result=1;
            for(int val:map.values())
                result *=(val+1);
            /* ==========output========== */
            System.out.println(result-1);
        }
        br.close();
    }
}
