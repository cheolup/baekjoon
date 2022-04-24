// BOJ_2564_경비원

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2564 {
    static class Shop {
        private int dir;
        private int dis;
        Shop(int dir, int dis) {
            this.dir = dir;
            this.dis = dis;
        }
        public int getDir() {
            return this.dir;
        }
        public int getDis() {
            return this.dis;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hor = Integer.parseInt(st.nextToken());
        int ver = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        Shop[] shop = new Shop[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            shop[i] = new Shop(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        Shop x = new Shop(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        /* ==========sol========== */
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (x.getDir() == 1) {
                if (shop[i].getDir() == 1) {
                    result += Math.abs(x.getDis()-shop[i].getDis());
                } else if (shop[i].getDir() == 2) {
                    result += Math.min(x.getDis()+ver+shop[i].getDis(), hor-x.getDis() + ver + hor-shop[i].getDis());
                } else if (shop[i].getDir() == 3) {
                    result += x.getDis() + shop[i].getDis();
                } else if (shop[i].getDir() == 4) {
                    result += hor-x.getDis()+shop[i].getDis();
                }
            } else if (x.getDir() == 2) {
                if (shop[i].getDir() == 1) {
                    result += Math.min(x.getDis()+ver+shop[i].getDis(), hor-x.getDis() + ver + hor-shop[i].getDis());
                } else if (shop[i].getDir() == 2) {
                    result += Math.abs(x.getDis()-shop[i].getDis());
                } else if (shop[i].getDir() == 3) {
                    result += x.getDis()+ver-shop[i].getDis();
                } else if (shop[i].getDir() == 4) {
                    result += hor - x.getDis() + ver - shop[i].getDis();
                }
            } else if (x.getDir() == 3) {
                if (shop[i].getDir() == 1) {
                    result += x.getDis()+shop[i].getDis();
                } else if (shop[i].getDir() == 2) {
                    result += x.getDis()+ver-shop[i].getDis();
                } else if (shop[i].getDir() == 3) {
                    result += Math.abs(x.getDis()-shop[i].getDis());
                } else if (shop[i].getDir() == 4) {
                    result += Math.min(x.getDis()+hor+shop[i].getDis(), ver-x.getDis() + hor + ver-shop[i].getDis());
                }
            } else if (x.getDir() == 4) {
                if (shop[i].getDir() == 1) {
                    result += x.getDis()+ver-shop[i].getDis();
                } else if (shop[i].getDir() == 2) {
                    result += hor-x.getDis()+ver-shop[i].getDis();
                } else if (shop[i].getDir() == 3) {
                    result += Math.min(x.getDis()+hor+shop[i].getDis(), ver-x.getDis() + hor + ver-shop[i].getDis());
                } else if (shop[i].getDir() == 4) {
                    result += Math.abs(x.getDis()-shop[i].getDis());
                }
            }

        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
