// BOJ_1358_하키

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1358 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result=0;
        for(int i=0;i<P;i++){
            st=new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(y>=Y&&y<=Y+H) {
                if(x>=X&&x<=X+W){
                    result++;
                }else if(x<X){
                    if(Math.sqrt(Math.pow(x-X,2)+Math.pow(y-(Y+H/2),2))<=H/2){
                        result++;
                    }
                }else {
                    if(Math.sqrt(Math.pow(x-(X+W),2)+Math.pow(y-(Y+H/2),2))<=H/2){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
