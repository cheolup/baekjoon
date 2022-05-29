// BOJ_1269_대칭 차집합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_1269 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<Integer> setA = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }
        Set<Integer> setB = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }
        /* ==========sol========== */
        Set<Integer> tempA = new HashSet<>();
        Set<Integer> tempB = new HashSet<>();
        tempA.addAll(setA);
        tempB.addAll(setB);
        tempA.removeAll(setB);
        tempB.removeAll(setA);
        /* ==========output========== */
        System.out.println(Math.abs(tempA.size()+tempB.size()));
        br.close();
    }
}
