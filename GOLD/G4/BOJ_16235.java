// BOJ_16235_나무 재테크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_16235 {
    static int N, M, K;
    static int[][] map,init;
    static LinkedList<Tree> trees;
    static LinkedList<Tree> sub;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static class Tree implements Comparable<Tree>{
        int x,y,z,live;
        public Tree(int x, int y, int z, int live) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.live = live;
        }
        @Override
        public int compareTo(Tree o) {
            return this.z - o.z;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N+1][N+1];
        init = new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                map[i][j]= 5;
                init[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        trees = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            trees.add(new Tree(x,y,z,1));
        }
        for (int i = 0; i < K; i++) {
            spring();
            summer();
            fall();
            winter();
        }
        /* ==========output========== */
        System.out.println(trees.size());
        br.close();
    }
    static void spring(){
        sub = new LinkedList<>();
        for(Tree now: trees){
            if(map[now.x][now.y] >=now.z){
                map[now.x][now.y] -= now.z;
                now.z++;
            }else {
                now.live=0;
            }
        }
    }
    static void summer(){
        for(Iterator<Tree> itt = trees.iterator(); itt.hasNext();){
            Tree t= itt.next();
            if(t.live == 0){
                map[t.x][t.y] += t.z / 2;
                itt.remove();
            }
        }
    }
    static void fall(){
        for(Tree t : trees){
            if(t.z % 5 == 0)
                for(int j=0; j<8; j++){
                    int nX = t.x + dx[j];
                    int nY = t.y + dy[j];
                    if(0<nX && nX<=N && 0<nY && nY<=N){
                        sub.add(new Tree(nX, nY, 1, 1));
                    }
                }
        }
        trees.addAll(0, sub);
    }
    static void winter(){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                map[i][j]+=init[i][j];
            }
        }
    }
}