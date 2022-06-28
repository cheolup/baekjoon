// BOJ_12851_숨바꼭질 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_12851 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        boolean[] visited = new boolean[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N]=true;
        int result1=0;
        int result2=0;
        while (!queue.isEmpty()){
            int size = queue.size();
            int count=0;
            boolean flag=false;
            Queue<Integer> temp = new LinkedList<>();
            for(int i=0;i<size;i++){
                int now = queue.poll();
                if(now==K){
                    count++;
                    flag=true;
                    continue;
                }
                if(now+1<=100000&&!visited[now+1]){
                    temp.add(now+1);
                    queue.add(now+1);
                }
                if(now-1>=0&&!visited[now-1]){
                    temp.add(now-1);
                    queue.add(now-1);
                }
                if(now*2<=100000&&!visited[now*2]){
                    temp.add(now*2);
                    queue.add(now*2);
                }
            }
            while (!temp.isEmpty()){
                visited[temp.poll()]= true;
            }
            if(flag) {
                result2=count;
                break;
            }
            result1++;
        }
        /* ==========output========== */
        System.out.println(result1);
        System.out.println(result2);
        br.close();
    }
}
