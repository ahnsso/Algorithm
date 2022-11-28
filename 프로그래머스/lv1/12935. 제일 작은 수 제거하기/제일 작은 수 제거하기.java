class Solution {
    public int[] solution(int[] arr) {
        
        if( arr.length == 1 ) {
            int[] answer = { -1 };
            return answer;
        }
        
        int[] answer = new int[ arr.length-1 ];
        int num = arr[0];
        
        for(int i = 0; i < arr.length; i++ ) {
            num = Math.min( num, arr[i] );
        }
        
        int index = 0;
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[i] != num ) {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}