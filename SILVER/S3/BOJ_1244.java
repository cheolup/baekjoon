// BOJ_1244_스위치 켜고 끄기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1244 {
    static class Turn{
        int gen;
        int num;
        Turn(int gen, int num){
            this.gen =gen;
            this.num = num;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] map = new boolean[n+1];
        Turn[] turns= new Turn[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            if(Integer.parseInt(st.nextToken())==1)
                map[i]=true;
        int m = Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            turns[i]=new Turn(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        /* ==========sol========== */
        for(int i=0;i<m;i++){
            if(turns[i].gen==1){
                int num=turns[i].num;
                while(num<=n){
                    map[num] = !map[num];
                    num+=turns[i].num;
                }
            } else{
                int mid=turns[i].num; // 3
                int x=1; // 2
                while(true){
                    if(mid-x<=0||mid+x>n) break;
                    if(map[mid-x]!=map[mid+x]) break;
                    x++;
                }
                x--;
                for(int j=mid-x; j<=mid+x;j++)
                    map[j]=!map[j];
            }
        }
        /* ==========output========== */
        for(int i=1;i<=n;i++){
            if(map[i])
                System.out.print("1 ");
            else
                System.out.print("0 ");
            if(i%20==0)
                System.out.println();
        }
        br.close();
    }
}
