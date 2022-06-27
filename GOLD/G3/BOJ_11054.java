// BOJ_11054_가장 긴 바이토닉 부분 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11054 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] num= new int[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int[] dpL= new int[N];
        int[] dpR= new int[N];
        for(int i=0;i<N;i++){
            dpL[i]=1;
            for(int j=0;j<i;j++){
                if(num[i]>num[j]){
                    dpL[i]=Math.max(dpL[j]+1,dpL[i]);
                }
            }
        }
        for(int i=N-1;i>=0;i--){
            dpR[i]=1;
            for(int j=N-1;j>i;j--){
                if(num[i]>num[j]){
                    dpR[i]=Math.max(dpR[j]+1,dpR[i]);
                }
            }
        }
        int result=0;
        for(int i=0;i<N;i++){
            result=Math.max(result,dpL[i]+dpR[i]);
        }
        /* ==========output========== */
        System.out.println(result-1);
        br.close();
    }
}
