// BOJ_10986_나머지 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10986 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        int[] num=new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int[] arr = new int[M];
        int sum =0;
        for(int i=0;i<N;i++){
            sum+=num[i]%M;
            arr[sum%M]++;
        }
        long result=arr[0];
        for(int i=0;i<M;i++){
            int temp =arr[i];
            result+=(long)temp*(temp-1)/2;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

}