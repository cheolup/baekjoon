// BOJ_3273_두 수의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_3273 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
                num[i]=Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        Arrays.sort(num);
        int left=0;
        int right=n-1;
        int count=0;
        while(left!=right){
            int sum=num[left] + num[right];
            if(sum==x){
                count++;
                if(num[left+1]+num[right]<=x){
                    left++;
                }else {
                    right--;
                }
            }else if(sum>x){
                right--;
            }else {
                left++;
            }
        }
        System.out.println(count);
        /* ==========output========== */
        br.close();
    }
}
