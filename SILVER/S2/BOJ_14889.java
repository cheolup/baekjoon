// BOJ_14889_스타트와 링크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14889 {
    static int[][] attribute;
    static boolean[] isSelected;
    static int n, result;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        attribute = new int[n][n];
        isSelected = new boolean[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                attribute[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        result = 987654321;
        dfs(0, 0);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    /* ==========dfs========== */
    public static void dfs(int cnt, int str) {
        if (cnt == n / 2) { // 절반의 사람들이 선택됬다면 팀이 완성된것이다.
            int dif; // start팀과 link팀의 차이
            int start = 0;
            int link = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (isSelected[i] && isSelected[j]) { // start 팀의 능력치 계산
                        start += attribute[i][j] + attribute[j][i];
                    } else if (!isSelected[i] && !isSelected[j]) {// link 팀의 능력치 계산
                        link += attribute[i][j] + attribute[j][i];
                    }
                }
            }
            dif = Math.abs(start - link);
            result = Math.min(result, dif);
            return;
        }
        for (int i = str; i < n; i++) { // start팀으로 뽑을 사람의 인덱스의 isSelected를 true로 바꾼다.
            if (!isSelected[i]) {
                isSelected[i] = true;
                dfs(cnt + 1, i + 1);
                isSelected[i] = false;
            }
        }
    }
}
