// BOJ_16935_배열 돌리기 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16935 {
    static int n, m, r;
    static int[][] map;
    static int[][] copy;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        copy=map.clone();
        int[] command = new int[r];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < r; i++) {
            command[i]=Integer.parseInt(st.nextToken());

        }
        /* ==========sol========== */
        for (int i = 0; i < r; i++) {
            map=copy.clone();
            switch(command[i]) {
                case 1:
                    rotate1();
                    break;
                case 2:
                    rotate2();
                    break;
                case 3:
                    rotate3();
                    break;
                case 4:
                    rotate4();
                    break;
                case 5:
                    rotate5();
                    break;
                case 6:
                    rotate6();
                    break;
            }
        }
        /* ==========output========== */
        print(n,m);
        br.close();
    }
    /* ==========rotate1========== */
    static void rotate1() {
        copy = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                copy[i][j] = map[n - 1 - i][j];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                map[i][j] = copy[i][j];

    }
    /* ==========rotate2========== */
    static void rotate2() {
        copy = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                copy[i][j] = map[i][m - 1 - j];

    }
    /* ==========rotate3========== */
    static void rotate3() {
        int temp=n;
        n=m;
        m=temp;
        copy = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                copy[i][j] = map[m - 1 - j][i];
        count++;
    }
    /* ==========rotate4========== */
    static void rotate4() {
        int temp=n;
        n=m;
        m=temp;
        copy = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                copy[i][j] = map[j][n - 1 - i];
        count++;
    }
    /* ==========rotate5========== */
    static void rotate5() {
        copy = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if(i<=n/2-1&&j<=m/2-1) {
                    copy[i][j] = map[n/2 + i][j];
                }else if(i<=n/2-1&&j>m/2-1) {
                    copy[i][j] = map[i][j - m/2];
                }else if(i>n/2-1&&j>m/2-1) {
                    copy[i][j] = map[i-n/2][j];
                }else if(i>n/2-1&&j<=m/2-1) {
                    copy[i][j] = map[i][j+m/2];
                }
    }
    /* ==========rotate6========== */
    static void rotate6() {
        copy = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (i <= n / 2 - 1 && j <= m / 2 - 1) {
                    copy[i][j] = map[i][j + m / 2];
                } else if (i <= n / 2 - 1 && j > m / 2 - 1) {
                    copy[i][j] = map[n / 2 + i][j];
                } else if (i > n / 2 - 1 && j > m / 2 - 1) {
                    copy[i][j] = map[i][j - m / 2];
                } else if (i > n / 2 - 1 && j <= m / 2 - 1) {
                    copy[i][j] = map[i - n / 2][j];
                }
    }
    /* ==========print========== */
    static void print(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(copy[i][j] + " ");
            System.out.println();
        }
    }
}