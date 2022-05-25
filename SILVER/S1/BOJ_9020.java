// BOJ_9020_골드바흐의 추측

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_9020 {
    public static void main(String[] args) throws IOException {
       boolean[] num = new boolean[10000+1];
        num[1]=true;
        for(int i=2;i<=10000;i++){
            int temp=i*2;
            while(temp<=10000){
                num[temp]=true;
                temp+=i;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<=10000;i++){
            if(!num[i]) list.add(i);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        /* ==========input========== */
        for(int test_case=1;test_case<=T;test_case++){
            int n=Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int temp1 =n/2;
            int temp2 =n/2;
            while(true){
                if(!num[temp1]&&!num[temp2]){
                    /* ==========output========== */
                    System.out.println(temp1 + " " + temp2);
                    break;
                }else {
                    temp1--;
                    temp2++;
                }
            }
        }
        br.close();
    }
}
