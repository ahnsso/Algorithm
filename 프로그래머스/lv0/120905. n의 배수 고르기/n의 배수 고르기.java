class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] arr = new int[numlist.length];
        int multiple = 0;
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n==0) {
                arr[multiple] = numlist[i];
                multiple++;
            }
        }
        
        int[] answer = new int[multiple];
        for(int i=0; i<multiple; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}