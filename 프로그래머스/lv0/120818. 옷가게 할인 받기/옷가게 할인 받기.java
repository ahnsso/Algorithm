class Solution {
    public int solution(int price) {
        int answer = 0;
        
        double five = price*0.95;
        double ten = price*0.9;
        double twenty = price*0.8;
        
        if(price>=100000 && price<300000) {
            answer = (int)five;
        } else if(price>=300000 && price<500000) {
            answer = (int)ten;
        } else if(price>=500000) {
            answer = (int)twenty;
        } else {
            answer = price;
        }
        
        return answer;
    }
}