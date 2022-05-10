// BOJ_1202_보석 도둑

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1202 {
    static int N, K;
    static class Gem implements Comparable<Gem>{
        int m,v;
        public Gem(int m, int v) {
            this.m = m;
            this.v = v;
        }
        @Override
        public int compareTo(Gem o) {
            if(this.m == o.m)
                return o.v -this.v;
            else
                return this.m - o.m;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        ArrayList<Gem> gems = new ArrayList<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            gems.add(new Gem(m,v));
        }
        Collections.sort(gems);
        ArrayList<Integer> bags = new ArrayList<>();
        for(int i=0;i<K;i++){
            bags.add(Integer.parseInt(br.readLine()));
        }
        /* ==========sol========== */
        Collections.sort(bags);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        long result=0;
        for(int i=0,j=0;i<K;i++){
            while(j<N&&gems.get(j).m<=bags.get(i)){
                queue.add(gems.get(j++).v);
            }
            if(!queue.isEmpty()){
                result+=queue.poll();
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
