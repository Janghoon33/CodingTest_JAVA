class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int HP = health;
        int attackIdx = 0;
        int heal = 0;
        
        for (int i = 1; i <= attacks[attacks.length-1][0]; i++){
            if (i != attacks[attackIdx][0]){ // 공격시간이 아닐때 힐
                HP += bandage[1];
                heal++; // 힐량 시전 시간 계산
                if (heal == bandage[0]){
                    HP += bandage[2];
                    heal = 0;
                }
                if (HP > health) {
                    HP = health;
                }
            } else { // 공격시간일때 체력깍임
                heal = 0;
                HP -= attacks[attackIdx][1];
                attackIdx++;
                if (HP <= 0) {
                    return -1;
                }
            }
        }
        return HP;
    }
}