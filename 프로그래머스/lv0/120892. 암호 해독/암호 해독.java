class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        char[] ch = cipher.toCharArray();
        //System.out.print(ch[0]);
        
        for(int i=0; i<cipher.length(); i++) {
            if((i+1)%code==0) {
                answer += ch[i];
            }
        }
                
        return answer;
    }
}