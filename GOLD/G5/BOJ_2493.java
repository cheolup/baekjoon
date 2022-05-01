// BOJ_2493_탑

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2493 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> stack = new Stack<>();
        for(int i=0;i<n;i++){
            int temp = Integer.parseInt(st.nextToken());
            while(!stack.empty()){
                if(stack.peek()[1] < temp){
                    stack.pop();
                }
                else{
                    System.out.print(stack.peek()[0] + " ");
                    break;
                }
            }
            if(stack.isEmpty()){
                System.out.print("0 ");
            }
            stack.push(new int[] {i+1, temp});
        }
        br.close();
    }
}
