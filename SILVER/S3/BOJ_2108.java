// BOJ_2108_통계학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        double sum=0;
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(br.readLine());
            sum+=num[i];

        }
        /* ==========sol========== */
        Arrays.sort(num);
        int count=0;
        int maxCount=-1;
        int mod =num[0];
        boolean flag = false;
        for(int i=0;i<N-1;i++){
            if(num[i]==num[i+1]){
                count++;
            }else {
                count=0;
            }
            if(maxCount<count){
                maxCount=count;
                mod = num[i];
                flag = true;
            }else if(maxCount == count && flag){
                mod = num[i];
                flag =false;
            }
        }
        /* ==========output========== */
        System.out.println(Math.round(sum/N));
        System.out.println(num[N/2]);
        System.out.println(mod);
        System.out.println(num[N-1]-num[0]);
        br.close();
    }
}
