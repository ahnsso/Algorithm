class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ch;
        
        for( int i=0; i<my_string.length(); i++ ) {
            ch = my_string.charAt(i);    
            if( ch >= 65 && ch <= 90 ) {    //대문자인 경우
                answer += my_string.valueOf(ch).toLowerCase();
                
            } else if( ch >= 97 && ch <= 122) { //소문자인 경우
                answer += my_string.valueOf(ch).toUpperCase();
                
            } else {
                answer += (char)ch;
            }
        }
        return answer;
    }
}