// BOJ_19941_햄버거 분배

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19941 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        /* ==========sol========== */
        char[] arr = new char[N];
        for(int i=0; i<N;i++)
            arr[i]=str.charAt(i);
        int result=0;
        boolean pick;
        for(int i=0;i<N;i++){
            if(arr[i]=='P'){
                pick=false;
                for(int j=K; j>=0;j--){
                    if(i-j>=0){
                        if(arr[i-j]=='H'){
                            arr[i-j]='B';
                            result++;
                            pick=true;
                            break;
                        }
                    }
                }
                if(!pick){
                    for(int j=1; j<=K;j++){
                        if(i+j<N){
                            if(arr[i+j]=='H'){
                                arr[i+j]='B';
                                result++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
