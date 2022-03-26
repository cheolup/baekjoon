// BOJ_2847_게임을 만든 동준이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2847 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] level = new int[N];
        for (int i = N-1; i >= 0; i--)
            level[i] = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result=0;
        for(int i=1;i<N;i++){
            if(level[i]>=level[i-1]){
                result+=level[i]-level[i-1]+1;
                level[i]=level[i-1]-1;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}