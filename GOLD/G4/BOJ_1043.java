// BOJ_1043_거짓말

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1043 {
    static int N,M;
    static boolean[] fact;
    static int[] p;
    static int find(int x){
        if(p[x]==x)
            return p[x]=x;
        else
            return find(p[x]);
    }
    static void union(int a, int b){
        a=find(a);
        b=find(b);
        if(a!=b){
            if(a>b){
                p[a]=b;
            }else {
                p[b]=a;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        fact = new boolean[N+1];
        p = new int[N+1];
        for(int i=1;i<=N;i++){
            p[i]=i;
        }
        st = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(st.nextToken());
        for(int i=0;i<f;i++){
            fact[Integer.parseInt(st.nextToken())]=true;
        }
        ArrayList<Integer>[]people = new ArrayList[M];
        for(int i=0;i<M;i++){
            people[i]=new ArrayList<>();
        }
        int val=0;
        int temp=0;
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            if(p>0){
                temp = Integer.parseInt(st.nextToken());
                people[i].add(temp);
            }
            for(int j=1;j<p;j++){
                val = Integer.parseInt(st.nextToken());
                people[i].add(val);
                union(temp,val);
                temp=val;
            }
        }
        /* ==========sol========== */
        int index;
        int result=0;
        for(int i=1;i<fact.length;i++){
            if(fact[i]){
                fact[find(i)]=true;
            }
        }
        for(int i=0;i<M;i++){
            if(people[i].size()>0){
               index=find(people[i].get(0));
               if(!fact[index])
                   result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
