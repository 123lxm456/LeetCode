class Solution {
    public boolean isMonotonic(int[] nums) {
        return high(nums)||low(nums);
    }
    public boolean high(int[] nums)
    {
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < nums[i - 1])
            {
                return false;
            }
        }
        return true;
    }
    public boolean low(int[] nums)
    {
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > nums[i - 1])
            {
                return false;
            }
        }
        return true;
    }
}
/**
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}

 */
