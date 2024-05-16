import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            int listSize = list.size();
            
            if(list.size() == 0){
                list.add(arr[i]);
            } else {
                int lastIndex = list.get(list.size() - 1);
                int curSize = list.size();
                    if (lastIndex < arr[i] ){
                        list.add(arr[i]);
                    } else if (lastIndex >= arr[i] ){
                        list.remove(curSize-1);
                        i--;
                }
            }
        }
        int[] stk = list.stream().mapToInt(Integer::intValue).toArray();
        
        return stk;
    }
}