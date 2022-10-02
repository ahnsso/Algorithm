import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[26];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }
        
        String S = br.readLine();
        for(int j=0; j<S.length(); j++) {
            char c = S.charAt(j);
            
            if(arr[c-'a']==-1) {
                arr[c-'a'] = j;
            }
        }
        
        for(int a : arr) {
            System.out.print(a+" ");
        }
    }
}