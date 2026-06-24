class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE, mini = -1;
        for(int i = 0; i < points.length; i++){
            int[] nums = points[i];
            if(nums[0] == x || nums[1] == y){
                int len = LEN(nums, x, y);
                if(len < min){
                    min = len;
                    mini = i;
                }
            }
        }
        return mini;
    }
    public int LEN(int[] nums, int x, int y){
        return Math.abs(x - nums[0]) + Math.abs(y - nums[1]);
    }
}
