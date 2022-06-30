// BOJ_1021_회전하는 큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1021 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=N;i++){
            queue.add(i);
        }
        int result=0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int temp = Integer.parseInt(st.nextToken());

            int count=0;
            while (queue.peek() != temp){
                queue.add(queue.poll());
                count++;
            }
            result+=Math.min(count,queue.size()-count);
            queue.poll();
        }
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
