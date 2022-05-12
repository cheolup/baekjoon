// BOJ_2252_줄 세우기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2252 {
    static int N,M;
    static int[] degree;
    static  ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        degree = new int[N+1];
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            list.get(A).add(B);
            degree[B]++;
        }
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (degree[i]==0)
                queue.add(i);
        }
        while(!queue.isEmpty()){
            int now = queue.poll();
            sb.append(now).append(" ");
            for(int i=0;i<list.get(now).size();i++){
                int temp = list.get(now).get(i);
                degree[temp]--;
                if(degree[temp]==0)
                    queue.add(temp);
            }
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
