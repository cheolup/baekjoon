// BOJ_2263_트리의 순회

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2263 {
    static int n, index;
    static int[] in, post, pre;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        in = new int[n];
        post = new int[n];
        pre = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            in[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            post[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        getPre(0,n-1,0,n-1);
        /* ==========output========== */
        for(int i=0;i<n;i++){
            System.out.print(pre[i]+" ");
        }
        br.close();
    }
    static void getPre(int is,int ie,int ps,int pe){
        if(is<=ie&&ps<=pe){
            pre[index++]=post[pe];
            int pos = is;
            for(int i=is;i<=ie;i++){
                if(in[i]==post[pe]){
                    pos =i;
                    break;
                }
            }
            getPre(is,pos-1,ps,ps+pos-is-1);
            getPre(pos+1,ie,ps+pos-is,pe-1);
        }
    }
}
