// BOJ_5639_이진 검색 트리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5639 {
    static class Node{
        int num;
        Node left, right;
        public Node(int num, Node left, Node right) {
            this.num = num;
            this.left = left;
            this.right = right;
        }
        public Node(int num) {
            this.num = num;
        }
        void insert(int n){
            if(n<this.num){
                if(this.left == null){
                    this.left = new Node(n);
                }else {
                    this.left.insert(n);
                }
            }else {
                if(this.right == null){
                    this.right = new Node(n);
                }else {
                    this.right.insert(n);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root=new Node(Integer.parseInt(br.readLine()));
        while (true){
            String temp = br.readLine();
            if(temp==null || temp.equals("")) break;
            root.insert(Integer.parseInt(temp));
        }
        /* ==========output========== */
        recur(root);
        br.close();
    }
    static void recur(Node node){
        if(node==null) return;
        recur(node.left);
        recur(node.right);
        System.out.println(node.num);
    }
}
