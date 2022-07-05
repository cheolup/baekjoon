// BOJ_1016_제곱 ㄴㄴ 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1016 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        /* ==========sol========== */
        boolean[] arr = new boolean[(int)(max-min+1)];
        for(long i=2;i*i<=max;i++){
            long temp = i*i;
            long start = min%temp == 0 ? min/temp: (min/temp) +1;
            for(long j=start;j*temp<=max;j++){
                arr[(int)((j*temp)-min)]= true;
            }
        }
        int result=0;
        for(int i=0;i<max-min+1;i++){
            if(!arr[i]){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
