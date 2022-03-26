// BOJ_10773_제로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0)
                stack.pop();
            else
                stack.push(temp);
        }
        /* ==========sol========== */
        int result = 0;
        while (!stack.isEmpty())
            result += stack.pop();
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}