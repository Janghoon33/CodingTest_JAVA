import java.util.stream.IntStream;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2  == 1){
                a += num_list[i]+"";
            } else {
                b += num_list[i]+"";
            }
        }
        
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}