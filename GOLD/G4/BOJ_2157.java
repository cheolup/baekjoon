// BOJ_2157_여행

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2157 {
    static class Node{
        int to, num;
        public Node( int to, int num) {
            this.to = to;
            this.num = num;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Node>[] nodes = new ArrayList[N+1];
        for(int i=0;i<=N;i++){
            nodes[i]=new ArrayList<Node>();
        }
        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if(from>to) continue;
            nodes[from].add(new Node(to,num));
        }
        /* ==========sol========== */
        int[][] dp= new int[M+1][N+1];
        int result=0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int count=1;
        while (!queue.isEmpty()&& count<M){
            int size = queue.size();
            for(int s=0;s<size;s++){
                int now = queue.poll();
                for(int i=0;i<nodes[now].size();i++){
                    int to = nodes[now].get(i).to;
                    int num = dp[count][now]+nodes[now].get(i).num;
                    if(dp[count+1][to]>=num) continue;
                    dp[count+1][to]= num;
                    queue.add(to);
                }
            }
            count++;
        }
        for(int i=2;i<=M;i++){
            result=Math.max(result,dp[i][N]);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
