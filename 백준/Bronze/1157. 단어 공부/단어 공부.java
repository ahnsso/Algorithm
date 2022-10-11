import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int[] arr = new int[26]; //영문자개수26개
		String s = sc.next();
 
		for (int i=0; i<s.length(); i++){
			if ('A'<=s.charAt(i) && s.charAt(i)<='Z') {
				arr[s.charAt(i)-'A']++;
			} else {
				arr[s.charAt(i)-'a']++;
			}
		}
 
		int max = -1;
		char ch = '?';
 
		for (int i =0; i<26; i++) {
			if (arr[i]>max) {
				max = arr[i];
				ch = (char) (i+65); //대문자출력을 위해 65를 더해줌
			} else if (arr[i]==max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
	}
}