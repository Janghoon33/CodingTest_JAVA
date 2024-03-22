import java.util.stream.IntStream;
class Solution {
    public int solution(int[] num_list) {
        return IntStream.range(0, num_list.length).map(i -> num_list[i]).reduce(1, (x, y) -> x * y)
            < (int) Math.pow(IntStream.of(num_list).sum(),2) ? 1 : 0; 
    }
}