// BOJ_10866_덱

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_10866 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dequeue = new LinkedList<>();
        StringTokenizer st;
        int temp;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (!str.equals("push_front")) {
                if (!str.equals("push_back")) {
                    if (!str.equals("pop_front")) {
                        if (!str.equals("pop_back")) {
                            if (!str.equals("size")) {
                                if (!str.equals("empty")) {
                                    if (str.equals("front")) {
                                        if (dequeue.isEmpty())
                                            System.out.println(-1);
                                        else
                                            System.out.println(dequeue.getFirst());
                                    } else if (str.equals("back")) {
                                        if (dequeue.isEmpty())
                                            System.out.println(-1);
                                        else
                                            System.out.println(dequeue.getLast());
                                    }
                                } else {
                                    if (dequeue.isEmpty())
                                        System.out.println(1);
                                    else
                                        System.out.println(0);
                                }
                            } else
                                System.out.println(dequeue.size());
                        } else {
                            if (dequeue.isEmpty())
                                System.out.println(-1);
                            else
                                System.out.println(dequeue.pollLast());
                        }
                    } else {
                        if (dequeue.isEmpty())
                            System.out.println(-1);
                        else
                            System.out.println(dequeue.pollFirst());
                    }
                } else {
                    temp = Integer.parseInt(st.nextToken());
                    dequeue.addLast(temp);
                }
            } else {
                temp = Integer.parseInt(st.nextToken());
                dequeue.addFirst(temp);
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        br.close();
    }
}