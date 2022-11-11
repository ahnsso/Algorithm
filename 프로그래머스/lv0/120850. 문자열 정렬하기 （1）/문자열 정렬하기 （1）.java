import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        char[] arr = my_string.toCharArray();
        String my_string2 = "";
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>=48 && arr[i]<=57) {  // 0~9 : 48~57
                my_string2 += arr[i];
            }
        }
        
        int[] answer = new int[my_string2.length()];
        String[] arr2 = new String[my_string2.length()];
        for(int i=0; i<my_string2.length(); i++) {
            arr2[i] = String.valueOf(my_string2.charAt(i)); //char to String
            answer[i] = Integer.parseInt(arr2[i]);
        }

        Arrays.sort(answer);
        return answer;
    }
}