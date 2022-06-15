// BOJ_15684_사다리 조작

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15684 {
    static int N, M, H,ableN;
    static boolean[][] map,ableline;
    static Node[] ablelist,choice;
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /* ==========input========== */
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map= new boolean[H+1][N];
        ableline= new boolean[H+1][N];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            map[a][b]=true;
            ableline[a][b]=true;
            if(b!=1){
                ableline[a][b-1]=true;
            }
            if(b!=N-1){
                ableline[a][b+1]=true;
            }
        }
        /* ==========sol========== */
        for(int i=1;i<=H;i++){
            for (int j=1;j<N;j++){
               if(!ableline[i][j]){
                   ableN++;
               }
            }
        }
        ablelist= new Node[ableN];
        ableN=0;
        for(int i=1;i<=H;i++){
            for (int j=1;j<N;j++){
                if(!ableline[i][j]){
                    ablelist[ableN++]=new Node(i,j);
                }
            }
        }
        /* ==========output========== */
        for(int i=0;i<=3;i++){
            choice=new Node[i];
            com(i,0,0);
        }
        System.out.println(-1);
        br.close();
    }
    static boolean simulate(Node[] newline){
        boolean flag=true;
        boolean[][] newmap = new boolean[H+1][N];
        for(int i=1;i<=H;i++){
            for (int j=1;j<N;j++){
                newmap[i][j]=map[i][j];
            }
        }
        for(int i=0;i<newline.length;i++){
            Node temp =newline[i];
            newmap[temp.x][temp.y]=true;
        }
        for(int i=1;i<=N;i++){
            int position=i;
            for(int j=1;j<=H;j++){
                if(position!=N&&newmap[j][position]){
                    position++;
                }else if(position!=1&&newmap[j][position-1]){
                    position--;
                }
            }
            if(position!=i){
                flag=false;
                break;
            }
        }
        return flag;
    }
    static void com(int num, int count,int start) {
        if (count == num) {
            boolean flag = simulate(choice);
            if(flag){
                System.out.println(num);
                System.exit(0);
            }
            return;
        }
        for (int i = start; i < ableN; i++) {
            choice[count]=ablelist[i];
            com(num,count+1,i+1);
        }
    }
}
