// BOJ_2792_보석 상자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2792 {
    static int N, M, min;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] gem = new int[M];
        for (int i = 0; i < M; i++)
            gem[i] = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        Arrays.sort(gem);
        int start = 1;
        int end = gem[M - 1];
        int mid;
        min = Integer.MAX_VALUE;
        while(start<=end){
            mid = (start + end) / 2;
            int temp = remain(gem, mid);
            if(temp<=N){
                min =Math.min(min, mid);
                end= mid -1;
            } else{
                start = mid+1;
            }
        }
        /* ==========output========== */
        System.out.println(min);
        br.close();
    }
    /* ==========remain========== */
    static int remain(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < M; i++) {
            count += arr[i]/n;
            if(arr[i]%n!=0)
                count++;
        }
        return count;
    }
}
