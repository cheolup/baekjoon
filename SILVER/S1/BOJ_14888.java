// BOJ_14888_연산자 끼워넣기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14888 {
    static int N,max,min;
    static int[] nums;
    static int[] op;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        op = new int[4];
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        dfs(nums[0],1);
        /* ==========output========== */
        System.out.println(max);
        System.out.println(min);
        br.close();
    }
    /* ==========dfs========== */
    static void dfs(int num,int count){
        if(count==N){
            max=Math.max(max,num);
            min=Math.min(min,num);
            return;
        }
        for(int i=0;i<4;i++) {
            if(op[i]>0) {
                op[i]--;
                switch (i) {
                    case 0:
                        dfs(num+nums[count],count+1);
                        break;
                    case 1:
                        dfs(num-nums[count],count+1);
                        break;
                    case 2:
                        dfs(num*nums[count],count+1);
                        break;
                    case 3:
                        dfs(num/nums[count],count+1);
                        break;
                }
                op[i]++;
            }
        }
    }
}
