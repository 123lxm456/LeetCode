
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int sub = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(Math.abs(start- i) < sub){
                    sub = Math.abs(start - i);
                }
            }
        }
        return sub;
    }
}
/*
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res = Math.min(res, Math.abs(i - start));
            }
        }
        return res;
    }
}
*/
