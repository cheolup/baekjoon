// BOJ_20061_모노미노도미노 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_20061 {
    static int result=0;
    static int sum=0;
    static int[][] blue = new int[4][6];
    static int[][] green = new int[6][4];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            blue(t,x,y);
            blueCheck();
            green(t,x,y);
            greenCheck();
        }
        for(int k=0;k<4;k++){
            for(int j=0;j<6;j++){
                if(blue[k][j]==1) sum++;
            }
        }
        for(int k=0;k<6;k++){
            for(int j=0;j<4;j++){
                if(green[k][j]==1) sum++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        System.out.println(sum);
        br.close();
    }
    static void green(int t, int x,int y){
        int h;
        switch (t){
            case 1:
                h=5;
                for(int i=2;i<6;i++){
                    if(green[i][y]!=0){
                        h=i-1;
                        break;
                    }
                }
                green[h][y]=1;
                break;
            case 2:
                h=5;
                for(int i=2;i<6;i++){
                    if(green[i][y]!=0){
                        h=i-1;
                        break;
                    }
                }
                for(int i=2;i<6;i++){
                    if(green[i][y+1]!=0){
                        h=Math.min(h,i-1);
                        break;
                    }
                }
                green[h][y]=1;
                green[h][y+1]=1;
                break;
            case 3:
                h=5;
                for(int i=2;i<6;i++){
                    if(green[i][y]!=0){
                        h=i-1;
                        break;
                    }
                }
                green[h][y]=1;
                green[h-1][y]=1;
                break;
        }
    }
    static void greenCheck(){
        for(int i=2;i<6;i++){
            int count=0;
            for(int j=0;j<4;j++){
                if(green[i][j]==1){
                    count++;
                }
            }
            if(count==4){
                greenGravity(i);
                result++;
            }
        }
        int h = isGreenOver();
        greenDelete(h);
    }
    static void greenDelete(int h){
        for(int i=5;i>=2;i--){
            for(int j=0;j<4;j++){
                green[i][j]=green[i-h][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                green[i][j]=0;
            }
        }
    }
    static int isGreenOver(){
        int count=0;
        for(int j=0;j<2;j++){
            for(int i=0;i<4;i++){
                if(green[j][i]==1){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    static void greenGravity(int x){
        for(int i=0;i<4;i++){
            green[x][i]=0;
        }
        for(int i=x;i>0;i--){
            for(int j=0;j<4;j++){
                green[i][j]=green[i-1][j];
            }
        }
        for(int i=0;i<4;i++){
            green[0][i]=0;
        }
    }

    static void blue(int t, int x,int y){
        int h;
        switch (t){
            case 1:
                h=5;
                for(int i=2;i<6;i++){
                    if(blue[x][i]!=0){
                        h=i-1;
                        break;
                    }
                }
                blue[x][h]=1;
                break;
            case 2:
                h=5;
                for(int i=2;i<6;i++){
                    if(blue[x][i]!=0){
                        h=i-1;
                        break;
                    }
                }
                blue[x][h]=1;
                blue[x][h-1]=1;
                break;
            case 3:
                h=5;
                for(int i=2;i<6;i++){
                    if(blue[x][i]!=0){
                        h=i-1;
                        break;
                    }
                }
                for(int i=2;i<6;i++){
                    if(blue[x+1][i]!=0){
                        h=Math.min(h,i-1);
                        break;
                    }
                }
                blue[x][h]=1;
                blue[x+1][h]=1;
                break;
        }
    }
    static void blueCheck(){
        for(int i=2;i<6;i++){
            int count=0;
            for(int j=0;j<4;j++){
                if(blue[j][i]==1){
                    count++;
                }
            }
            if(count==4){
                blueGravity(i);
                result++;
            }
        }
        int h = isBlueOver();
        blueDelete(h);
    }
    static void blueDelete(int h){
        for(int i=5;i>=2;i--){
            for(int j=0;j<4;j++){
                blue[j][i]=blue[j][i-h];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                blue[j][i]=0;
            }
        }
    }
    static int isBlueOver(){
        int count=0;
        for(int j=0;j<2;j++){
            for(int i=0;i<4;i++){
                if(blue[i][j]==1){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    static void blueGravity(int y){
        for(int i=0;i<4;i++){
            blue[i][y]=0;
        }
        for(int i=y;i>0;i--){
            for(int j=0;j<4;j++){
                blue[j][i]=blue[j][i-1];
            }
        }
        for(int i=0;i<4;i++){
            blue[i][0]=0;
        }
    }
}
