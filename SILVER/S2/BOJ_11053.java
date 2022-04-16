// BOJ_11053_가장 긴 증가하는 부분 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11053 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] d = new int[N];
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int max=1;
        d[0]=1;
        for (int i = 1; i < N; i++) {
            d[i]=1;
            for(int j=0;j<=i;j++){
                if(num[j]<num[i]&&d[j]>=d[i]){
                    d[i]=d[j]+1;
                    max=Math.max(max,d[i]);
                }
            }
        }
        /* ==========output========== */
        System.out.println(max);
        br.close();
    }
}
