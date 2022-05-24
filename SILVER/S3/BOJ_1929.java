// BOJ_1929_소수 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        boolean[] num = new boolean[N+1];
        num[1]=true;
        for(int i=2;i<=N;i++){
            int temp=i*2;
            while(temp<=N){
                num[temp]=true;
                temp+=i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=M;i<=N;i++){
            if(!num[i]){
                sb.append(i).append("\n");
            }
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
