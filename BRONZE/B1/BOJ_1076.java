// BOJ_1076_저항

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1076 {
    static String[] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first= br.readLine();
        String second= br.readLine();
        String third= br.readLine();
        /* ==========sol========== */
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        for(int i=0;i<10;i++){
            if(first.equals(color[i])){
                firstNum=i;
                break;
            }
        }
        for(int i=0;i<10;i++){
            if(second.equals(color[i])){
                secondNum=i;
                break;
            }
        }
        for(int i=0;i<10;i++){
            if(third.equals(color[i])){
                thirdNum=i;
                break;
            }
        }
        String str ="";
        str+=firstNum;
        str+=secondNum;
        long result = Long.parseLong(str)*(long)Math.pow(10,thirdNum);
        /* ==========output========== */
        System.out.println(result);

        br.close();
    }
}
