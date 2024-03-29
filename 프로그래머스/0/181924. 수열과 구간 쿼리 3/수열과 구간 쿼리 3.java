class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int a = 0;
        for(int j=0; j<queries.length; j++){
            a = arr[queries[j][0]];
            arr[queries[j][0]] = arr[queries[j][1]];
            arr[queries[j][1]] = a;
        }
        return arr;
    }
}