// BOJ_10828_스택

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_10828 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (!command.equals("push")) {
                if (!command.equals("pop")) {
                    if (!command.equals("top")) {
                        if (command.equals("size"))
                            System.out.println(stack.size());
                        else if (command.equals("empty")) {
                            if (stack.size() == 0)
                                System.out.println("1");
                            else
                                System.out.println("0");
                        }
                    } else {
                        if (stack.size() == 0)
                            System.out.println("-1");
                        else
                            System.out.println(stack.peek());
                    }
                } else {
                    if (stack.size() == 0)
                        System.out.println("-1");
                    else
                        System.out.println(stack.pop());
                }
            } else {
                stack.push(Integer.parseInt(st.nextToken()));
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        br.close();
    }
}