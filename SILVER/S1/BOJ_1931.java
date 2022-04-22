// BOJ_1931_회의실 배정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1931 {
    static class Hall implements Comparable<Hall> {
        int start;
        int end;
        public Hall(int start, int end) {
            this.start = start;
            this.end = end;
        }
        public int compareTo(Hall o) {
            if (this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Hall[] time = new Hall[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            time[i] = new Hall(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        /* ==========sol========== */
        Arrays.sort(time);
        int result = 0;
        int s = 0;
        for(int i = 0;i<n;i++){
            if(time[i].start >= s){
                s=time[i].end;
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
