// BOJ_11478_서로 다른 부분 문자열의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_11478 {
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        String name="";
        for(int i=0;i< str.length();i++){
            name="";
            for(int j=i;j<str.length();j++){
                name+=str.substring(j,j+1);
                set.add(name);
            }
        }
        /* ==========output========== */
        System.out.println(set.size());
        br.close();
    }

}
