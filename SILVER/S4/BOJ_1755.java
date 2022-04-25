// BOJ_1755_숫자놀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1755 {
    static String[] sample = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static class Node implements Comparable<Node> {
        String str; // 영문으로 변환한 문자
        int index; // 해당 영문의 숫자형
        public Node(String str, int index) {
            this.str = str;
            this.index = index;
        }
        @Override
        public int compareTo(Node o) {
            return this.str.compareTo(o.str);
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        PriorityQueue<Node> queue = new PriorityQueue<>();
        for (int i = M; i <= N; i++) {
            String str = "";
            if (i < 10) {
                str = sample[i];
            } else {
                str += sample[i / 10];
                str += " ";
                str += sample[i % 10];
            }
            queue.add(new Node(str, i));
        }
        int count = 1; // 줄을 뛰기위한 카운터
        /* ==========output========== */
        while (!queue.isEmpty()) {
            System.out.print(queue.poll().index+ " ");
            if (count == 10) { // 숫자를 10개 출력을 했으면 한 줄을 뛴다.
                count = 0;
                System.out.println();
            }
            count++;
        }
        br.close();
    }
}
