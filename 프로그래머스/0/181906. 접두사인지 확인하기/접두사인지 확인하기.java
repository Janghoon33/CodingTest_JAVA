import java.util.*;

class Solution {
    public int solution(String str, String is_prefix) {
        return str.endsWith(is_prefix) || str.startsWith(is_prefix) ? 1 : 0;
    }
}