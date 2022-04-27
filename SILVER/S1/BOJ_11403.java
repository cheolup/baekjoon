// BOJ_11403_경로 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11403 {
    static int N;
    static int[][] graph;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        visited = new boolean[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                graph[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        for(int k=0;k<N;k++){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(graph[i][k]==1&&graph[k][j]==1){
                        graph[i][j]=1;
                    }
                }
            }
        }
        /* ==========output========== */
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        br.close();
    }
}