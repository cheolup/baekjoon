// BOJ_11651_좌표 정렬하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11651 {
    static class Node implements Comparable<Node>{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Node o) {
            if(this.y==o.y){
                return this.x -o.x;
            }else {
                return this.y -o.y;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());
            nodes[i]= new Node(x,y);
        }
        /* ==========sol========== */
        Arrays.sort(nodes);
        /* ==========output========== */
        for (int i = 0; i < N; i++)
            System.out.println(nodes[i].x + " " + nodes[i].y);
        br.close();
    }
}
