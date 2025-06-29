import java.util.*;

class Solution {
    public int solution(String str, String is_suffix) {
        String[] jubArray = new String[str.length()];
        int answer;
        for(int i = 0; i < str.length(); i++){
            jubArray[i] = str.substring(i);
        }
        answer = Arrays.stream(jubArray).anyMatch(is_suffix::equals) ? 1 : 0;
        return answer;
    }
}