import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {    //IOException(java.io 패키지를 import 해야함) 혹은 그냥 Exception(import 없음)
        int ch = System.in.read();
        System.out.print(ch);
    }
}