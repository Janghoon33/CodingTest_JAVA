class Solution {
    public int solution(int n, String control) {
        char[] cntArr = control.toCharArray();
        
        for(int i = 0; i < cntArr.length; i++){
            if (cntArr[i] == 'w') n += 1;
            else if (cntArr[i] == 's') n -= 1;
            else if (cntArr[i] == 'd') n += 10;
            else if (cntArr[i] == 'a') n -= 10;
        }
        
        return n;
    }
}