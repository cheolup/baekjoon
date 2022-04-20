// BOJ_14501_퇴사

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N+2];
        int[] P = new int[N+2];
        int[] d = new int[N+2];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            T[i]=Integer.parseInt(st.nextToken());
            P[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=N;i>0;i--){
            int time= T[i];
            int pay =P[i];
            if(i+time>N+1) {
                d[i]=d[i+1];
            } else{
                d[i]=Math.max(d[i+time]+pay,d[i+1]);
            }
        }
        System.out.println(d[1]);
        br.close();
    }
}
