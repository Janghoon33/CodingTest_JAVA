class Solution {
    public int solution(int n, String control) {
        char[] cntArr = control.toCharArray();
        
        for(int i = 0; i < cntArr.length; i++){
            n = cntArr[i] == 'w' ? n+1 : (cntArr[i] == 's' ? n-1 : (cntArr[i] == 'd') ? n+10 : n-10);
        }
        
        return n;
    }
}