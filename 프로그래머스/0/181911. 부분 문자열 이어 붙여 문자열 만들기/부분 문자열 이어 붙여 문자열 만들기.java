import java.util.Arrays;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        String answer2 = "";
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++){
            String textParts = my_strings[i];
            int[] partSize = parts[i];   
            
            answer2 = textParts.substring(partSize[0], partSize[1]+1);
            
            SB.append(answer2);
        }
        answer = SB.toString();
        return answer;
    }
}