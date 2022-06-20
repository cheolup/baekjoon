// BOJ_16926_배열 돌리기 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16926 {
    static int N, M,R;
    static int[][] map;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int round=Math.min(N,M);
        for(int k=0;k<round/2;k++){
            int count = (N-1-2*k)*2+(M-1-2*k)*2;
            for(int l=0;l<R%count;l++){
                rotation(k,k,N-1-k,M-1-k);
            }
        }
        /* ==========output========== */
        for (int i = 0; i < N; i++) {
            for(int j=0;j<M;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        br.close();
    }
    static void rotation(int x1, int y1, int x2, int y2){
        int temp = map[x1][y1];
        int row=x1;
        int col=y1;
        int dir=0;
        while (true){
            int nr = row + dx[dir];
            int nc = col + dy[dir];
            if(nr==x1&&nc==y1) break;
            if(nr<x1||nr>x2||nc<y1||nc>y2) {
                dir++;
                continue;
            }else {
                map[row][col]=map[nr][nc];
                row=nr;
                col=nc;
            }
        }
        map[x1+1][y1]=temp;
    }
}
