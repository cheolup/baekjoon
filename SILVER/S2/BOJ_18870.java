// BOJ_18870_좌표 압축

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_18870 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] X= new int[N];
        int[] copy= new int[N];
        for(int i=0;i<N;i++){
            X[i]=Integer.parseInt(st.nextToken());
            copy[i]=X[i];
        }
        /* ==========sol========== */
        Arrays.sort(copy);
        int index=0;
        for(int n : copy)
            if(!hash.containsKey(n))
                hash.put(n,index++);
        for(int n:X)
            sb.append(hash.get(n)).append(" ");
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
