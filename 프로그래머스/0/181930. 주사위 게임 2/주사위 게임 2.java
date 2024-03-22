class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int oneNum = a+b+c;
        int twoNum = (int) (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        int threeNum = (int) (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        
        return answer = (a==b && b==c) ? oneNum*twoNum*threeNum : ((a==b || a==c || b==c) ? oneNum*twoNum : oneNum) ;
    }
}