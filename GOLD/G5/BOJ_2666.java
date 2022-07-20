// BOJ_2666_벽장문의 이동

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2666 {
    static int n,m,result;
    static int[] order;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n=Integer.parseInt(br.readLine());
        st  = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        m=Integer.parseInt(br.readLine());
        order=new int [m];
        for(int i=0;i<m;i++){
            order[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        result=Integer.MAX_VALUE;
        dfs(a,b,0,0);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void dfs(int a, int b, int depth,int count){
        if(depth==m){
            result=Math.min(result,count);
            return;
        }
        dfs(order[depth],b,depth+1,count+Math.abs(a-order[depth]));
        dfs(a,order[depth], depth+1,count+Math.abs(b-order[depth]));
    }
}
