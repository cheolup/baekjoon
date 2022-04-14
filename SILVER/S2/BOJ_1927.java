// BOJ_1927_최소 힙

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_1927 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> heap =new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp==0){
                if(heap.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(heap.poll());
                }
            }else {
                heap.add(temp);
            }
        }
        br.close();
    }
}
