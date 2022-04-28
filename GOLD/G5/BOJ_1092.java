// BOJ_1092_배

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1092 {
    static int N, M;
    static boolean[] broken = new boolean[10];
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cranes = new int[N];
        for (int i = 0; i < N; i++) {
            cranes[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] weight = new int[M];
        for (int i = 0; i < M; i++) {
            weight[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        /* ==========output========== */
        Arrays.sort(cranes);
        Arrays.sort(weight);
        remove(cranes, weight);
        br.close();
    }
    static void remove(int[] cranes, int[] weight) {
        int result = 0;
        int wIndex = weight.length - 1;
        loop: while (true) {
            if(cranes[cranes.length-1]<weight[weight.length-1]){
                result=-1;
                break;
            }
            for (int i = cranes.length - 1; i >= 0; i--) {
                for (int j = weight.length - 1; j >= 0; j--) {
                    if (weight[j] != -1) {
                        if (cranes[i] >= weight[j]) {
                            if(i==cranes.length-1){
                                result++;
                            }
                            wIndex--;
                            weight[j]=-1;
                            break;
                        }
                    }
                    if (wIndex == -1) {
                        break loop;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
