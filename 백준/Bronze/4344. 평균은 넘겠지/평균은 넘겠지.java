import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] arr;
        int C = Integer.parseInt(br.readLine());
        
        for(int i=0; i<C; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];
            
            double sum = 0;
            for(int j=0; j<N; j++) {
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }
            
            double Aver = (sum/N);
            double count = 0;
            for(int j=0; j<N; j++) {
                if(arr[j]>Aver) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }
}