class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.toLowerCase().split("");   // 전체소문자로 만들고, 문자열 공백기준으로 잘라 넣음
        
        boolean blank = true; // 이전문자가 공백인지 체크, 첫글자 무조건 대문자
        
        for( String str : arr ) {
            answer += blank ? str.toUpperCase() : str; // 공백(true)이면 대문자로
            blank = str.equals(" ") ? true : false;
        }
        
        return answer;
    }
}