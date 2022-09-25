import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int count = 0;
        int max = 0;
        int index = 0;
        
        for(int val : arr) {
            count++;
            if(val > max) {
                max = val;
                index = count;
            }
        }
        
        System.out.print(max + "\n" + index);
    }
}