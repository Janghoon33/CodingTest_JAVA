import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int num = num_list.length+1;  
        int[] answer = new int[num];  
        
        System.arraycopy(num_list,0,answer,0,num-1);
        answer[num-1] = num_list[num-2]>num_list[num-3] ? num_list[num-2] - num_list[num-3] : num_list[num-2]*2;
        return answer; 
    }
}