// BOJ_19539_사과나무

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19539 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int sum =0;
        int count=0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            int temp = Integer.parseInt(st.nextToken());
            sum += temp;
            if(temp %2 == 1){
                count++;
            }
        }
        if((sum%3)==0 && (count <= sum/3))
            System.out.println("YES");
        else
            System.out.println("NO");
        br.close();
    }
}