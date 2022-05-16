// BOJ_12015BOJ_12015_가장 긴 증가하는 부분 수열 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_12015 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i=0;i<N;i++){
            if(list.get(list.size()-1)<A[i]){
                list.add(A[i]);
            }else {
                int left = 1;
                int right = list.size()-1;
                while(left<right){
                    int mid = (left+right)/2;
                    if(list.get(mid)<A[i]){
                        left = mid+1;
                    }else {
                        right = mid;
                    }
                }
                list.set(right,A[i]);
            }
        }
        /* ==========output========== */
        System.out.println(list.size()-1);
        br.close();
    }
}
