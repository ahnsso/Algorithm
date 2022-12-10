class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if( s.length() != 4 && s.length() != 6 ) {
            answer = false;
        }
        
        if( answer == true ) {
            for( int i = 0; i < s.length(); i++ ) {
                char c = s.charAt(i);
                if( ( c >= 'A' && c <= 'Z' ) || (  c >= 'a' && c <= 'z' )) {
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}