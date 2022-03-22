// BOJ_1049_기타줄

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1049 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] pack = new int[M];
        int[] one = new int[M];
        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            pack[i] = Integer.parseInt(st.nextToken());
            one[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(pack);
        Arrays.sort(one);
        int result= pack[0]*(N/6)+one[0]*(N%6);
        if(result>pack[0]*(N/6+1))
            result=pack[0]*(N/6+1);
        if(result>one[0]*N)
            result=one[0]*N;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
