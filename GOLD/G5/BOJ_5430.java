// BOJ_5430_AC

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            /* ==========input========== */
            String com = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            arr = arr.substring(1, arr.length() - 1);
            st = new StringTokenizer(arr, "[],");
            Deque<Integer> deque = new LinkedList<>();
            while (st.hasMoreTokens()) {
                deque.add(Integer.parseInt(st.nextToken()));
            }
            /* ==========sol========== */
            String result = ac(com, deque);
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    static String ac(String com,Deque<Integer> deque){
        boolean dir = false;
        for(char command :com.toCharArray() ){
            if(command=='R'){
                dir = !dir;
            }else{
                if(deque.size() ==0)
                    return "error";
                if(dir)
                    deque.removeLast();
                else
                    deque.removeFirst();
            }
        }
        StringBuilder sb = new StringBuilder("[");
        while(!deque.isEmpty()){
            if(dir){
                sb.append(deque.removeLast());
            }else {
                sb.append(deque.removeFirst());
            }
            if(deque.size()!=0){
                sb.append(',');
            }
        }
        sb.append("]");
        return sb.toString();
    }
}