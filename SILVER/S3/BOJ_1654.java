// BOJ_1654_랜선 자르기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1654 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] line = new long[K];
        for (int i = 0; i < K; i++)
            line[i] = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        Arrays.sort(line);
        long start =1;
        long end= line[K-1];
        long mid;
        while(start<=end){
            mid = (start + end)/2;
            long temp =0;
            for(int i=0;i<K;i++)
                temp += line[i] / mid;
            if(temp>=N) start =mid +1;
            else end = mid -1;
        }
        /* ==========output========== */
        System.out.println(end);
        br.close();
    }
}
