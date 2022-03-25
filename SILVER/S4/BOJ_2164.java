// BOJ_2164_카드2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        /* ==========sol========== */
        for(int i =1;i<=N;i++)
            queue.add(i);
        while(queue.size()>1){
            queue.poll();
            queue.add(queue.poll());
        }
        /* ==========output========== */
        System.out.println(queue.poll());
        br.close();
    }
}