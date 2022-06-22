// BOJ_1966_프린터 큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1966 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N= Integer.parseInt(st.nextToken());
            int M= Integer.parseInt(st.nextToken());
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> index = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                queue.add(Integer.parseInt(st.nextToken()));
                index.add(i);
            }
            /* ==========sol========== */
            int count=0;
            while(true){
                for(int i=9;i>=1;i--){
                    if(queue.contains(i)){
                        while (true){
                            if(queue.peek()==i){
                                queue.poll();
                                index.poll();
                                count++;
                                break;
                            }else {
                                queue.add(queue.poll());
                                index.add(index.poll());
                            }
                        }
                        break;
                    }
                }
                if(!index.contains(M))break;
            }
            /* ==========output========== */
            System.out.println(count);
        }
        br.close();
    }
}
