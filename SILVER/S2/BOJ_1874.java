// BOJ_1874_스택 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] num = new int[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        Stack<Integer> stack = new Stack<>();
        int index =0;
        int count=1;
        StringBuilder sb = new StringBuilder();
        while (index<N){
            if(!stack.empty()&&num[index]< stack.get(stack.size()-1)){
                break;
            }else if(!stack.empty()&&num[index] == stack.get(stack.size()-1)){
                stack.pop();
                sb.append("-").append("\n");
                index++;
            }else {
                while (count<=N){
                    if(num[index]!=count){
                        stack.push(count);
                        sb.append("+").append("\n");
                        count++;
                    }else {
                        stack.push(count);
                        sb.append("+").append("\n");
                        count++;
                        break;
                    }
                }
            }
        }
        /* ==========output========== */
        if(index==N){
            System.out.println(sb);
        }else {
            System.out.println("NO");
        }
        br.close();
    }
}
