// BOJ_1764_듣보잡

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> list = new HashMap<>();
        for(int i=1;i<=N;i++)
            list.put(br.readLine(),i);
        /* ==========sol========== */
        List<String> result = new ArrayList<>();
        for(int i=0;i<M;i++){
            String temp = br.readLine();
            if(list.containsKey(temp))
                result.add(temp);
        }
        Collections.sort(result);
        /* ==========output========== */
        System.out.println(result.size());
        for(String str:result)
            System.out.println(str);
        br.close();
    }
}
