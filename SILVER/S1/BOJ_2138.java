// BOJ_2138_전구와 스위치

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2138 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        boolean[] start0 = new boolean[N];
        boolean[] start1 = new boolean[N];
        boolean[] end = new boolean[N];
        String str = br.readLine();
        int min=987654321;
        for (int i = 0; i < N; i++) {
            if(str.charAt(i) - '0'== 1) start0[i] = true;
            if(str.charAt(i) - '0'== 1) start1[i] = true;
        }
        str = br.readLine();
        for (int i = 0; i < N; i++)
            if(str.charAt(i) - '0'== 1) end[i] = true;
        start1[0]=!start1[0];
        start1[1]=!start1[1];
        int count0=0;
        int count1=1;
        for (int i = 1; i < N; i++) {
            if(start0[i-1] != end[i-1]) {
                count0++;
                if(i+1<N) {
                    start0[i-1] = !start0[i-1];
                    start0[i] = !start0[i];
                    start0[i+1] = !start0[i+1];
                } else {
                    start0[i-1] = !start0[i-1];
                    start0[i] = !start0[i];
                }
            }
            if(start1[i-1] != end[i-1]) {
                count1++;
                if(i+1<N) {
                    start1[i-1] = !start1[i-1];
                    start1[i] = !start1[i];
                    start1[i+1] = !start1[i+1];
                } else {
                    start1[i-1] = !start1[i-1];
                    start1[i] = !start1[i];
                }
            }
        }
        if(Arrays.equals(start0, end)) {min = Math.min(min, count0);}
        if(Arrays.equals(start1, end)) {min = Math.min(min, count1);}
        /* ==========output========== */
        if(min == 987654321) {
            System.out.println(-1);
        }else {
            System.out.println(min);
        }
        br.close();
    }

}
