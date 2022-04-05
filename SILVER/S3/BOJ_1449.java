// BOJ_1449_수리공 항승

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1449 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            map[i]=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        Arrays.sort(map);
        int result=0;
        int end=0;
        for(int i=0; i<N;i++){
            if(map[i]>=end){
                result++;
                end= map[i]+L;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
