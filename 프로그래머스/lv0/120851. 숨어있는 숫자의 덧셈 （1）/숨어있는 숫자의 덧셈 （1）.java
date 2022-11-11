class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String my_string2 = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]","");
        String[] arr = my_string2.split("");
        for(int i=0; i<arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}