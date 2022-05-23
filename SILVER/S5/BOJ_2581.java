// BOJ_2581_소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2581 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        ArrayList<Integer> list = new ArrayList<>();
        int result=0;
        for(int i=M;i<=N;i++){
            if(check(i)){
                list.add(i);
                result+=i;
            }
        }
        /* ==========output========== */
        if(result!=0) {
            System.out.println(result);
            System.out.println(list.get(0));
        }else {
            System.out.println(-1);
        }
        br.close();
    }
    static boolean check(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
           if(n%i==0){
               return false;
           }
        }
        return true;
    }
}
