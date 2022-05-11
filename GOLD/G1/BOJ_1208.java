// BOJ_1208_부분수열의 합 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1208 {
    static int N, S;
    static long result;
    static long[] num;
    static ArrayList<Long> leftList=new ArrayList<>();
    static ArrayList<Long> rightList=new ArrayList<>();

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        num = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i] = Long.parseLong(st.nextToken());
        }
        /* ==========sol========== */
        makeSum(0,0,N/2,leftList);
        makeSum(0,N/2,N,rightList);
        Collections.sort(leftList);
        Collections.sort(rightList);
        result=0;
        cal();
        /* ==========output========== */
        if(S==0){
            result--;
        }
        System.out.println(result);
        br.close();
    }
    static void cal(){
        int pointerL= 0;
        int pointerR= rightList.size()-1;
        while (pointerL != leftList.size() && pointerR >= 0) {
            long left = leftList.get(pointerL);
            long right = rightList.get(pointerR);
            if (left + right == S) {
                long leftCount = 0;
                while (pointerL < leftList.size() && leftList.get(pointerL) == left) {
                    leftCount++;
                    pointerL++;
                }
                long rightCount = 0;
                while (pointerR >= 0 && right == rightList.get(pointerR)) {
                    rightCount++;
                    pointerR--;
                }
                result += leftCount * rightCount;
            }
            if (left + right > S) {
                pointerR--;
            }
            if (left + right < S) {
                pointerL++;
            }
        }
    }
    static void makeSum(long sum,int start,int end,ArrayList<Long> list){
        if(start==end){
            list.add(sum);
            return;
        }
        makeSum(sum+num[start],start+1,end,list);
        makeSum(sum,start+1,end,list);
    }
}
