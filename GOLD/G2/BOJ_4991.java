// BOJ_4991_로봇 청소기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_4991 {
    static int w,h,N,result;
    static char[][] map;
    static boolean[][] visited;
    static ArrayList<Node> trash;
    static int startX,startY;
    static int[][] dist;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[] order;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            /* ==========input========== */
            st= new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w==0&h==0) break;
            map= new char[h][w];
            trash = new ArrayList<>();
            N=1;
            for(int i=0;i<h;i++){
                String str = br.readLine();
                for(int j=0;j<w;j++){
                    char temp = str.charAt(j);
                    if(temp=='o'){
                        startX=i;
                        startY=j;
                        trash.add(new Node(i,j));
                    }else if(temp=='*'){
                        map[i][j]=temp;
                        N++;
                    }else {
                        map[i][j]=temp;
                    }
                }
            }
            /* ==========sol========== */
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                   if(map[i][j]=='*'){
                        trash.add(new Node(i,j));
                    }
                }
            }
            dist=new int[N+1][N+1];
            order=new int[N+1];
            result=Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    int dis = bfs(trash.get(i).x, trash.get(i).y,trash.get(j).x, trash.get(j).y);
                    if (dis == -1) {
                        result = -1;
                    } else {
                        dist[i][j] = dist[j][i] = dis;
                    }
                }
            }
            per(0,0,0,new boolean[N]);
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    static void per(int index, int count,int sum,boolean[] selected){
        if(count==N-1){
            result=Math.min(result,sum);
            return;
        }
        for(int i=1;i<N;i++){
            if(selected[i]) continue;
            selected[i]=true;
            order[count]=i;
            per(i,count+1,sum+dist[index][i],selected);
            selected[i]=false;
        }
    }
    static int bfs(int x,int y,int disX,int dixY){
        visited=new boolean[h][w];
        int move=0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));
        visited[x][y]=true;
        while (!queue.isEmpty()){
            int size= queue.size();
            for(int i=0;i<size;i++){
                Node now=queue.poll();
                if(now.x==disX&&now.y==dixY) return move++;
                for(int dir=0;dir<4;dir++){
                    int row = now.x+dx[dir];
                    int col = now.y+dy[dir];
                    if(row<0||row>=h||col<0||col>=w||visited[row][col]) continue;
                    if(map[row][col]!='x'){
                        visited[row][col]=true;
                        queue.add(new Node(row,col));
                    }
                }
            }
            move++;
        }
        return -1;
    }
}
