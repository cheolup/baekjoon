// BOJ_4949_균형잡힌 세상

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Loop: while(true){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            if(str.equals("."))break;
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<str.length();i++){
                char temp = str.charAt(i);
                if(temp=='('||temp=='['){
                    stack.push(temp);
                }else if(temp==']'){
                    if(stack.isEmpty()||stack.peek()!='['){
                        System.out.println("no");
                        continue Loop;
                    }else {
                        stack.pop();
                    }
                }else if(temp==')'){
                    if(stack.isEmpty()||stack.peek()!='('){
                        System.out.println("no");
                        continue Loop;
                    }else {
                        stack.pop();
                    }
                }
            }
            /* ==========output========== */
            if(stack.isEmpty()){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
        br.close();
    }
}
