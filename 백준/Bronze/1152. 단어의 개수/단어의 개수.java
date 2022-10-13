import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		int count = 0;
		int pre_str = 32;	//32는 공백
		int str ;           
        
		while(true) {
			str = System.in.read();    //입력받은 문자
            
			if(str==32) { 
				if(pre_str!=32) count++;
			}
 
			else if(str==10) {
				if(pre_str!=32) count++;
				break;
			}
			
			pre_str = str;
		}
		
		System.out.println(count);
	}
 
}