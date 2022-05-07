// BOJ_10815_숫자 카드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10815 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] card = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            card[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Loop : for(int i=0;i<M;i++){
            int temp = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = N-1;
            int mid;
            while (left<=right){
                mid=(left+right)/2;
                int midNum=card[mid];
                if(midNum==temp){
                    System.out.print(1 + " ");
                    continue Loop;
                }
                if(midNum>temp){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
            System.out.print(0+" ");
        }
        br.close();
    }
}
