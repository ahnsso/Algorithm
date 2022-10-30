class Solution {
    public int solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        int max = answer[0];
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(i!=j) {
                    answer[i] = numbers[i]*numbers[j];
                    if(max < answer[i]) {
                        max = answer[i];
                    }
                }
            }
        }
        
        return max;
    }
}