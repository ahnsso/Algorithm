import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double a = Double.parseDouble(st.nextToken());    //오차범위를 벗어나지 않게 하기 위해(문제의 조건) 반드시 double형으로 출력
        double b = Double.parseDouble(st.nextToken());
        
        System.out.println(a/b);
    }
}