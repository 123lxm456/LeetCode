class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int max = 0, sum = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                sum += nums[i];
            }
            else{
                max = Math.max(max, sum);
                sum = nums[i];
            }
        }
        max = Math.max(max, sum);
        return max;
    }
}
/*
class Solution {
    public int maxAscendingSum(int[] nums) {
        int res = 0;
        int l = 0;
        while (l < nums.length) {
            int cursum = nums[l++];
            while (l < nums.length && nums[l] > nums[l - 1]) {
                cursum += nums[l++];
            }
            res = Math.max(res, cursum);
        }
        return res;
    }
}

*/
