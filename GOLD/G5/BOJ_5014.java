// BOJ_3190_뱀

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_5014 {
    static class Node{
        int data;
        int depth;
        public Node(int data, int depth) {
            this.data = data;
            this.depth = depth;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        boolean[] visited = new boolean[F+1];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(S,0));
        visited[S]=true;
        while (!queue.isEmpty()){
            Node now = queue.poll();
            if(now.data==G){
                System.out.println(now.depth);
                return;
            }
            if(now.data+U<=F&&!visited[now.data+U]){
                visited[now.data+U]=true;
                queue.add(new Node(now.data+U,now.depth+1));
            }
            if(now.data-D>0&&!visited[now.data-D]){
                visited[now.data-D]=true;
                queue.add(new Node(now.data-D,now.depth+1));
            }
        }
        /* ==========output========== */
        System.out.println("use the stairs");
        br.close();
    }
}
