// BOJ_16967_배열 복원하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16967 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H=Integer.parseInt(st.nextToken());
        int W=Integer.parseInt(st.nextToken());
        int X=Integer.parseInt(st.nextToken());
        int Y=Integer.parseInt(st.nextToken());
        int[][] AB = new int[H+X][W+Y];
        int[][] A = new int[H][W];
        for(int i=0;i<H+X;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<W+Y;j++){
                AB[i][j]=Integer.parseInt(st.nextToken());
                if((i<X&&j<W)||(j<Y&&i<H)){
                    A[i][j]=AB[i][j];
                }
            }
        }
        /* ==========sol========== */
        for(int i=X;i<H;i++){
            for(int j=Y;j<W;j++){
                A[i][j]=AB[i][j]-A[i-X][j-Y];
            }
        }
        /* ==========output========== */
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        br.close();
    }
}
