import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());        
        
        if(A>0) {
            if(B>0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {    // A가 음수일 때
            if(B>0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
       
    }
}