// BOJ_11866_요세푸스 문제 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=N;i++)
            queue.add(i);
        sb.append("<");
        for(int i=0;i<N;i++) {
            for(int j=0;j<K-1;j++)
                queue.add(queue.poll());
            sb.append(queue.poll()).append(", ");
        }
        sb.setLength(sb.length()-2);
        sb.append(">");
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}