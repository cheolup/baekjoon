// BOJ_10816_숫자 카드 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] total = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            total[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(total);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int temp= Integer.parseInt(st.nextToken());
            sb.append(countNum(total, temp)).append(" ");
        }
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    /* ==========countNum========== */
    static int countNum(int[] arr,int temp){
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]>= temp)
                end=mid;
            else
                start = mid+1;
        }
        int leftIndex = end;
        start=0;
        end=arr.length;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]> temp)
                end=mid;
            else
                start = mid+1;
        }
        int rightIndex = end;
        return  rightIndex - leftIndex;
    }

}