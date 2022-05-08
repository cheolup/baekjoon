// BOJ_1004_어린 왕자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            /* ==========sol========== */
            StringTokenizer st= new StringTokenizer(br.readLine());
            int x1= Integer.parseInt(st.nextToken());
            int y1= Integer.parseInt(st.nextToken());
            int x2= Integer.parseInt(st.nextToken());
            int y2= Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(br.readLine());
            int result=0;
            for(int i=0;i<n;i++){
                st= new StringTokenizer(br.readLine());
                int cx= Integer.parseInt(st.nextToken());
                int cy= Integer.parseInt(st.nextToken());
                int r= Integer.parseInt(st.nextToken());
                int count=0;
                if(inner(x1,y1,cx,cy,r)) count++;
                if(inner(x2,y2,cx,cy,r)) count++;
                if(count==1)result++;
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    static boolean inner(int x,int y, int cx, int cy, int r){
        double dis = Math.sqrt(Math.pow(x-cx,2)+Math.pow(y-cy,2));
        return dis <= r;
    }
}
