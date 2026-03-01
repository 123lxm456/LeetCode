class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int max = 1;
        int k = 1;
        for(int i = 0; i < n-1; i++)
        {
            if(nums[i + 1] > nums[i])
            {
                k++;
            }
            else
            {
                max = Math.max(max,k);
                k = 1;
            }
        }
        max = Math.max(max,k);
        return max;
    }
}
