import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");    //공백단위 분리
        int a = Integer.parseInt(st.nextToken());    //nextToken():문자열반환
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(a+b);
    }
}