// BOJ_2623_음악프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2623 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<=N;i++){
            list.add(new ArrayList<>());
        }
        int[] degree= new int[N+1];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            if(k==0) continue;
            int nodeA=Integer.parseInt(st.nextToken());
            for(int j=1;j<k;j++){
                int nodeB =Integer.parseInt(st.nextToken());
                list.get(nodeA).add(nodeB);
                degree[nodeB]++;
                nodeA=nodeB;
            }
        }
        /* ==========sol========== */
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(degree[i]==0)
                queue.add(i);
        }
        while(!queue.isEmpty()){
            int now = queue.poll();
            result.add(now);
            for(int temp: list.get(now)){
                degree[temp]--;
                if(degree[temp]==0) {
                    queue.add(temp);
                }
            }
        }
        /* ==========output========== */
        if(result.size()==N){
            for (Integer integer : result) {
                System.out.println(integer);
            }
        }else {
            System.out.println(0);
        }
        br.close();
    }
}
