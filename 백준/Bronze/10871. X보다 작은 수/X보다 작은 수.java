import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine()," ");
        
        for(int i=1; i<=N; i++) {
            int A = Integer.parseInt(st.nextToken());
            if(A<X) {
                bw.write(A+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}