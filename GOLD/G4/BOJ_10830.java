// BOJ_10830_행렬 제곱

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10830 {
    static int N;
    static long B;
    static int[][] A, matrix;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        B = Long.parseLong(st.nextToken());
        A = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                A[i][j] = Integer.parseInt(st.nextToken())%1000;
            }
        }
        /* ==========sol========== */
        matrix= recur(B);
        /* ==========output========== */
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        br.close();
    }
    static int[][] recur(long B){
        if(B==1){
            return A;
        }
        int[][] mat1 = recur(B/2);
        if(B%2==0){
            return cal(mat1,mat1);
        }else {
            int[][] mat2 = cal(mat1,A);
            return cal(mat1,mat2);
        }
    }
    static int[][] cal(int[][] A,int [][] B){
        int[][] mat = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    mat[i][j]+=(A[i][k]*B[k][j])%1000;
                }
                mat[i][j]%=1000;
            }
        }
        return mat;
    }
}
