// BOJ_3107_IPv6

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3107 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        /* ==========sol========== */
        StringTokenizer st = new StringTokenizer(in,":");
        int count = st.countTokens(); // 8-count= 축약된 부분
        int delete = 8-count;
        int index=0;
        String[] str=new String[8];
        int i=0;
        if(in.charAt(0)==':'){
            i=delete;
            while(i<8){
                str[i]=st.nextToken();
                while(index!=in.length()&&in.charAt(index++)!=':'){
                }
                i++;
            }
        } else{
            while(i<8){
                str[i]=st.nextToken();
                while(index!=in.length()&&in.charAt(index++)!=':'){
                }
                if(index!=in.length()&&in.charAt(index)==':')
                    i+=delete;
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<8;j++){
            if(str[j]==null){
                str[j]="0000";
            } else{
                int len = str[j].length();
                if(len==1){
                    str[j]= "000" + str[j];
                }else if(len==2){
                    str[j]= "00" + str[j];
                }else if(len==3){
                    str[j]= "0" + str[j];
                }
            }
            sb.append(str[j]).append(":");
        }
        sb.setLength(sb.length()-1);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
