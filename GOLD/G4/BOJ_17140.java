// BOJ_17140_이차원 배열과 연산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_17140 {
    static int r,c,k;
    static int sizeR,sizeC;
    static int[][] map;
    static class Frequency implements Comparable<Frequency>{
        int num, count;
        public Frequency(int num, int count) {
            this.num = num;
            this.count = count;
        }
        @Override
        public int compareTo(Frequency o) {
            if(this.count==o.count){
                return this.num - o.num;
            }else {
                return this.count - o.count;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map=new int[101][101];
        for(int i=1;i<=3;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=3;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        sizeR=3;
        sizeC=3;
        int result=0;
        while (map[r][c] != k) {
            if (sizeR >= sizeC) {
                operationR();
            } else {
                operationC();
            }
            result++;
            if (result > 100) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void operationR(){
        int maxCol=0;
        for(int i=1;i<=sizeR;i++){
            ArrayList<Frequency> list = new ArrayList<>();
            for(int j=1;j<=sizeC;j++){
                int temp = map[i][j];
                if(temp==0) continue;
                int index = -1;
                boolean flag=false;
                for(int l=0;l<list.size();l++){
                    if(list.get(l).num==temp){
                        flag=true;
                        index=l;
                        break;
                    }
                }
                if(flag){
                    list.get(index).count++;
                }else {
                    list.add(new Frequency(temp,1));
                }
            }
            Collections.sort(list);
            maxCol=Math.max(maxCol,list.size()*2);
            for(int j=0;j<50;j++){
                if(j<list.size()){
                    map[i][j*2+1]=list.get(j).num;
                    map[i][j*2+2]=list.get(j).count;
                } else {
                    map[i][j*2+1]=0;
                    map[i][j*2+2]=0;
                }
            }
        }
        sizeC=maxCol;
    }
    static void operationC(){
        int maxRow=0;
        for(int i=1;i<=sizeC;i++){
            ArrayList<Frequency> list = new ArrayList<>();
            for(int j=1;j<=sizeR;j++){
                int temp = map[j][i];
                if(temp==0) continue;
                int index = -1;
                boolean flag=false;
                for(int l=0;l<list.size();l++){
                    if(list.get(l).num==temp){
                        flag=true;
                        index=l;
                        break;
                    }
                }
                if(flag){
                    list.get(index).count++;
                }else {
                    list.add(new Frequency(temp,1));
                }
            }
            Collections.sort(list);
            maxRow=Math.max(maxRow,list.size()*2);
            for(int j=0;j<50;j++){
                if(j<list.size()){
                    map[j*2+1][i]=list.get(j).num;
                    map[j*2+2][i]=list.get(j).count;
                } else {
                    map[j*2+1][i]=0;
                    map[j*2+2][i]=0;
                }
            }
        }
        sizeR=maxRow;
    }
}