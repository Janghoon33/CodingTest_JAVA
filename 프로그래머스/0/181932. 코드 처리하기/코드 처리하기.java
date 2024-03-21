class Solution {
    public String solution(String code) {
        String answer = "";
        char[] b = code.toCharArray();
        int mode = 0;
        
        for(int i = 0; i < b.length; i++){
            
            if(mode == 0) {
                if (b[i] == '1') {
                    mode = 1;
                } else if (i%2==0) {
                    answer = answer+b[i];                    
                }   
            } else if(mode == 1) {
                if (b[i] == '1') {
                    mode = 0;
                } else if (i%2==1){
                    answer = answer+b[i];
                }
            }
    }
    if(answer == ""){answer = "EMPTY";}
        return answer;
    }
}