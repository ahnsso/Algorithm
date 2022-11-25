class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String num2 = Integer.toString(num);
        String k2 = Integer.toString(k);
        
        if(num2.indexOf(k2)==-1) {
            answer = -1;
        } else {
            answer = num2.indexOf(k2)+1;
        }
        
        return answer;
    }
}