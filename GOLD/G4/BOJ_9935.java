// BOJ_9935_문자열 폭발

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_9935 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String boom = br.readLine();
        /* ==========sol========== */
        int size= boom.length();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
            if(stack.size()>=size){
                boolean flag = true;
                for(int j=0;j<size;j++){
                    if(stack.get(stack.size()-size+j)!=boom.charAt(j)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    for(int j=0;j<size;j++){
                        stack.pop();
                    }
                }
            }
        }
        /* ==========output==========  */
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< stack.size();i++){
            sb.append(stack.get(i));
        }
        if (sb.length()==0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
        br.close();
    }
}
