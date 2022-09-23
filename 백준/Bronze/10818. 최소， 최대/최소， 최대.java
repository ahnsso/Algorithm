import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());    // 입력받는 갯수는 사용안하므로 입력만 받기
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int max = -1000001;    // -1,000,000보다 크거나 같은 정수
        int min = 1000001;    // 1,000,000보다 작거나 같은 정수
        
        while(st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            
            if(a>max) {
                max = a;
            }
            if(a<min) {
                min = a;
            }
        }
        
        System.out.print(min+" "+max);
    }
}