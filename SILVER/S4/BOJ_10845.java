// BOJ_10845_큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        int temp = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (!str.equals("push")) {
                if (!str.equals("pop")) {
                    if (!str.equals("size")) {
                        if (!str.equals("empty")) {
                            if (str.equals("front")) {
                                if (queue.isEmpty()) {
                                    System.out.println(-1);
                                } else
                                    System.out.println(queue.peek());
                            } else if (str.equals("back")) {
                                if (queue.isEmpty())
                                    System.out.println(-1);
                                else
                                    System.out.println(temp);
                            }
                        } else if (queue.isEmpty())
                            System.out.println(1);
                        else
                            System.out.println(0);
                    } else
                        System.out.println(queue.size());
                } else if (queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.poll());
            } else {
                temp = Integer.parseInt(st.nextToken());
                queue.add(temp);
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        br.close();
    }
}