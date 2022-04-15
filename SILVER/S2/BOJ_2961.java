// BOJ_2961_도영이가 만든 맛있는 음식

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2961 {
    static int N,min;
    static boolean[] isSelected;
    static Food[] foods;
    static class Food {
        int sour;
        int bitter;
        public Food(int sour, int bitter) {
            this.sour = sour;
            this.bitter = bitter;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        foods = new Food[N];
        isSelected = new boolean[N];
        min=987654321;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            foods[i] = new Food(S, B);
        }
        /* ==========sol========== */
        generateSubset(0);
        /* ==========output========== */
        System.out.println(min);
        br.close();
    }
    /* ==========generateSubset========== */
    static void generateSubset(int cnt) {
        if (cnt == N) {
            int SelectedCount=0;
            for(int i=0; i<N;i++)
                if(isSelected[i])
                    SelectedCount++;
            if(SelectedCount==0) return;
            int temp = cal(isSelected);
            min = Math.min(min, temp);
            return;
        }
        isSelected[cnt] = true;
        generateSubset(cnt + 1);
        isSelected[cnt] = false;
        generateSubset(cnt + 1);
    }
    /* ==========cal========== */
    static int cal(boolean arr[]) {
        int sumS=1;
        int sumB=0;
        for(int i=0;i<N;i++) {
            if(arr[i]) {
                sumS *= foods[i].sour;
                sumB += foods[i].bitter;
            }
        }
        return Math.abs(sumB-sumS);
    }
}
