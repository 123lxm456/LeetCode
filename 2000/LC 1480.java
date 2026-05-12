class Solution {
    public int[] runningSum(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            num += nums[i];
            nums[i] = num;
        }
        return nums;
    }
}

/**
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
*/
