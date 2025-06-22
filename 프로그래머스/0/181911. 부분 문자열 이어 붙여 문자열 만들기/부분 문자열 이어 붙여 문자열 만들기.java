import java.util.Arrays;

class Solution {
    public StringBuilder solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++){
            // int[] part2 = parts[i];   
            
            SB.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }
        return SB;
    }
}