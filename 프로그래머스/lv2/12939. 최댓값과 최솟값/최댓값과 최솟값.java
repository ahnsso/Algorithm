class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        int[] newArr = new int[arr.length];
        for( int i = 0; i < arr.length; i++ ) {
            newArr[i] = Integer.parseInt( arr[i] );
        }
        
        int max = newArr[0];
        int min = newArr[0];
        
        for( int num : newArr ) {
            if( num > max ) {
                max = num;
            } else if ( num < min ) {
                min = num;
            }
            answer = min + " " + max;
        }
        
        
        return answer;
    }
}