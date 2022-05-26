// BOJ_7568_덩치

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_7568 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] data = new int[N][2];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            data[i][0] = Integer.parseInt(st.nextToken());
            data[i][1] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            int index=1;
            for(int j=0;j<N;j++){
                if(i==j) continue;
                if(data[i][0]<data[j][0]&&data[i][1]<data[j][1]){
                    index++;
                }
            }
            sb.append(index).append(" ");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
