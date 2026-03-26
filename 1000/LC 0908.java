class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0], min =  nums[0];
        for(int num:nums)
        {
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        max = max - k;
        min = min + k;
        return (max-min<0) ? 0 : max-min;
    }
}
