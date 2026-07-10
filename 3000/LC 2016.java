class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length, sub = -1;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] < nums[j]){
                    sub = Math.max(sub, nums[j] - nums[i]);
                }
            }
        }
        return sub;
    }
}
/**
//最优
class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int ans = -1, premin = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > premin) {
                ans = Math.max(ans, nums[i] - premin);
            } else {
                premin = nums[i];
            }
        }
        return ans;
    }
}
*/
