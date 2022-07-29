// BOJ_15663_N과 M (9)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_15663 {
    static int N,M;
    static int[] input;
    static int[] order;
    static boolean[] selected;
    static Set<String> set;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int[N];
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(input);
        selected=new boolean[N];
        order=new int[M];
        set=new HashSet<>();
        sb = new StringBuilder();
        recur(0);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void recur(int count){
        if(count==M){
            String str = "";
            for(int i=0;i<M;i++){
                str+=order[i]+" ";
            }
            if(!set.contains(str)){
                set.add(str);
                sb.append(str).append("\n");
            }
            return;
        }
        for(int i=0;i<N;i++){
            if(selected[i]) continue;
            selected[i]=true;
            order[count]=input[i];
            recur(count+1);
            selected[i]=false;
        }
    }
}
