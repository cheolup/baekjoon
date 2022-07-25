// BOJ_17298_오큰수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        for(int i=N-1;i>=0;i--){
            int temp = num[i];
            while(!tempStack.isEmpty() && temp >= tempStack.peek()){
                tempStack.pop();
            }
            if(tempStack.isEmpty()){
                stack.add(-1);
            }else {
                stack.add(tempStack.peek());
            }
            tempStack.add(temp);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(stack.pop()).append(" ");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
