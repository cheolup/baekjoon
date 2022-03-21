// BOJ_11723_집합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11723 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        boolean[] sub = new boolean[21];
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "add": {
                    int temp = Integer.parseInt(st.nextToken());
                    if (!sub[temp]) {
                        sub[temp] = true;
                    }
                    break;
                }
                case "remove": {
                    int temp = Integer.parseInt(st.nextToken());
                    if (sub[temp]) {
                        sub[temp] = false;
                    }
                    break;
                }
                case "check": {
                    int temp = Integer.parseInt(st.nextToken());
                    if (sub[temp]) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                }
                case "toggle": {
                    int temp = Integer.parseInt(st.nextToken());
                    sub[temp] = !sub[temp];
                    break;
                }
                case "all":
                    for (int j = 1; j <= 20; j++) {
                        sub[j] = true;
                    }
                    break;
                case "empty":
                    for (int j = 1; j <= 20; j++) {
                        sub[j] = false;
                    }
                    break;
            }
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
