import java.util.*;

class Solution {
    public String[] solution(String str) {
        String[] answer = new String[str.length()];

        for (int i = 0; i < str.length(); i++){
            answer[i] = str.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}