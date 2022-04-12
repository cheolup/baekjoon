// BOJ_15654_N과 M (5)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15654 {
    static int N,M;
    static int[] select, input;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int[N];
        select = new int[M];
        visited = new boolean[N];
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            input[i] = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        Arrays.sort(input);
        /* ==========output========== */
        per(0);
        br.close();
    }
    /* ==========per========== */
    public static void per(int cnt) {
        if(cnt == M){
            for(int i=0;i<M;i++)
                System.out.print(select[i]+ " ");
            System.out.println();
            return;
        }
        for(int i=0;i<N;i++){
            if(visited[i]) continue;
            select[cnt]=input[i];
            visited[i]=true;
            per(cnt+1);
            visited[i]=false;
        }
    }
}
