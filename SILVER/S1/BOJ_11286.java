// BOJ_11286_절댓값 힙

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_11286 {
    static int N;
    static PriorityQueue<Integer> queue;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        queue = new PriorityQueue<>((o1, o2) -> {
            if(Math.abs(o1)==Math.abs(o2)){
                return o1-o2;
            }else {
                return Math.abs(o1)-Math.abs(o2);
            }
        });
        for(int i=0;i<N;i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp!=0){
                queue.add(temp);
            }else{
                if(queue.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(queue.poll());
                }
            }
        }
        br.close();
    }
}