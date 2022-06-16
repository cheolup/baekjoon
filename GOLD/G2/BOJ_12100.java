// BOJ_12100_2048 (Easy)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_12100 {
    static int N,max;
    static int[][] map,copy;
    static int [] order;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        /* ==========input========== */
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        copy = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                copy[i][j]= map[i][j];
            }
        }
        /* ==========sol========== */
        order=new int[5];
        max=0;
        per(0);
        /* ==========output========== */
        System.out.println(max);
        br.close();
    }
    static void simulate(int dir){
        switch (dir){ // 왼쪽으로
            case 0:
                for(int i=0;i<N;i++){
                    Stack<Integer> stack = new Stack<>();
                    int temp=-1;
                    for(int j=0;j<N;j++){
                        int now =map[i][j];
                        if(now!=0){
                            if(temp==now){
                                stack.pop();
                                stack.push(2*now);
                                temp=-1;
                            }else {
                                stack.push(now);
                                temp=now;
                            }
                        }
                   }
                    int size= stack.size();
                    for(int j=N-1;j>=0;j--){
                        if(size>j){
                            map[i][j]=stack.pop();
                        }else {
                            map[i][j]=0;
                        }
                    }
                }
                break;
            case 1: // 위쪽으로
                for(int j=0;j<N;j++){
                    Stack<Integer> stack = new Stack<>();
                    int temp=-1;
                    for(int i=0;i<N;i++){
                        int now =map[i][j];
                        if(now!=0){
                            if(temp==now){
                                stack.pop();
                                stack.push(2*now);
                                temp=-1;
                            }else {
                                stack.push(now);
                                temp=now;
                            }
                        }
                    }
                    int size= stack.size();
                    for(int i=N-1;i>=0;i--){
                        if(size>i){
                            map[i][j]=stack.pop();
                        }else {
                            map[i][j]=0;
                        }
                    }
                }
                break;
            case 2: // 오른쪽으로
                for(int i=N-1;i>=0;i--){
                    Stack<Integer> stack = new Stack<>();
                    int temp=-1;
                    for(int j=N-1;j>=0;j--){
                        int now =map[i][j];
                        if(now!=0){
                            if(temp==now){
                                stack.pop();
                                stack.push(2*now);
                                temp=-1;
                            }else {
                                stack.push(now);
                                temp=now;
                            }
                        }
                   }
                    int index= N-stack.size();
                    for(int j=0;j<N;j++){
                        if(index<=j){
                            map[i][j]=stack.pop();
                        }else {
                            map[i][j]=0;
                        }
                    }
                }
                break;
            case 3: // 아래쪽으로
                for(int j=N-1;j>=0;j--){
                    Stack<Integer> stack = new Stack<>();
                    int temp=-1;
                    for(int i=N-1;i>=0;i--){
                        int now =map[i][j];
                        if(now!=0){
                            if(temp==now){
                                stack.pop();
                                stack.push(2*now);
                                temp=-1;
                            }else {
                                stack.push(now);
                                temp=now;
                            }
                        }
                    }
                    int index= N-stack.size();
                    for(int i=0;i<N;i++){
                        if(index<=i){
                            map[i][j]=stack.pop();
                        }else {
                            map[i][j]=0;
                        }
                    }
                }
                break;
        }
    }
    static void per(int count){
        if(count==5){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    map[i][j] = copy[i][j];
                }
            }
            for(int i=0;i<5;i++){
                simulate(order[i]);
            }
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    max=Math.max(max,map[i][j]);
                }
            }
            return;
        }
        for(int i=0;i<4;i++){
            order[count]=i;
            per(count+1);
        }
    }
}
