import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        
        for(int j=1; j<=9; j++) {
            System.out.println(i + " * " + j + " = " + (i*j));
        }
    }
}