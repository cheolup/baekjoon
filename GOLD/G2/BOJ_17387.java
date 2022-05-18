// BOJ_17387_선분 교차 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17387 {
    static class Point{
        long x,y;
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Point p1= new Point(Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()));
        Point p2= new Point(Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        Point p3= new Point(Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()));
        Point p4= new Point(Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()));
        /* ==========sol========== */
        int p123 = ccw(p1,p2,p3);
        int p124 = ccw(p1,p2,p4);
        int p341 = ccw(p3,p4,p1);
        int p342 = ccw(p3,p4,p2);
        boolean compare1 = Math.min(p1.x, p2.x) <= Math.max(p3.x, p4.x);
        boolean compare2 = Math.min(p3.x, p4.x) <= Math.max(p1.x, p2.x);
        boolean compare3 = Math.min(p1.y, p2.y) <= Math.max(p3.y, p4.y);
        boolean compare4 = Math.min(p3.y, p4.y) <= Math.max(p1.y, p2.y);
        boolean is_result=false;
        /* ==========output========== */
        if (p123 * p124 == 0 && p341 * p342 == 0) {
            is_result = true;
            if (compare1 && compare2 && compare3 && compare4) {
                System.out.println(1);
                return;
            }
        }
        if (p123 * p124 <= 0 && p341 * p342 <= 0) {
            if (!is_result) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
        br.close();
    }
    /* ==========ccw========== */
    static int ccw(Point p1, Point p2,Point p3){
        long result = ((p1.x * p2.y) + (p2.x * p3.y) + (p3.x * p1.y)) - ((p1.y * p2.x) + (p2.y * p3.x) + (p3.y * p1.x));
        if(result>0){
            return 1;
        }else if(result==0){
            return 0;
        }else {
            return -1;
        }
    }
}
