// BOJ_1991_트리 순회

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1991 {
    static int[][] tree;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        tree= new int[26][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int a=st.nextToken().charAt(0);
            int b=st.nextToken().charAt(0);
            int c=st.nextToken().charAt(0);
            tree[a-'A'][0]=(b=='.')?-1:b-'A';
            tree[a-'A'][1]=(c=='.')?-1:c-'A';
        }
        /* ==========sol========== */
        sb =new StringBuilder();
        pre(0);
        sb.append('\n');
        in(0);
        sb.append('\n');
        post(0);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void pre(int x){
        if(x==-1) return;
        sb.append((char)(x+'A'));
        pre(tree[x][0]);
        pre(tree[x][1]);
    }
    static void in(int x){
        if(x==-1) return;

        in(tree[x][0]);
        sb.append((char)(x+'A'));
        in(tree[x][1]);
    }
    static void post(int x){
        if(x==-1) return;
        post(tree[x][0]);
        post(tree[x][1]);
        sb.append((char)(x+'A'));
    }
}
