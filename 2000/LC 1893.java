class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int n = ranges.length;
        while(left <= right){
            int i = 0;
            for(i = 0; i < n; i++){
                if(ranges[i][0] <= left && left <= ranges[i][1]){
                    break;
                }
            }
            if(i == n){
                return false;
            }
            left++;
        }
        return true;
    }
}