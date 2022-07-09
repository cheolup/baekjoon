// BOJ_16139_인간-컴퓨터 상호작용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16139 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] sum = new int[str.length()][26];
        for(int i=0;i<str.length();i++){
            if(i==0){
                int c = str.charAt(i)-'a';
                sum[0][c]++;
            }else {
                for(int j=0;j<26;j++){
                    sum[i][j]=sum[i-1][j];
                }
                int c = str.charAt(i)-'a';
                sum[i][c]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<q;i++){
            st = new StringTokenizer(br.readLine());
            int c = st.nextToken().charAt(0) -'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            sb.append(l>0?sum[r][c]-sum[l-1][c]:sum[r][c]).append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
