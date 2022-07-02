// BOJ_16472_고냥이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16472 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        /* ==========sol========== */
        int[] arr = new int[26];
        int result=1;
        int count=1;
        arr[str.charAt(0)-'a']++;
        for(int i=0,j=1;j<str.length();j++){
            if(arr[str.charAt(j)-'a']==0){
                count++;
            }
            arr[str.charAt(j)-'a']++;
            while(count > N){
                arr[str.charAt(i) - 'a'] -= 1;
                if (arr[str.charAt(i) - 'a'] == 0){
                    count -= 1;
                }
                i++;
            }
            if (j - i + 1 > result){
                result = j - i + 1;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
