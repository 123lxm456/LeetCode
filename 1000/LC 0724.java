/*
class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            if(call(nums,i) == calr(nums,i))
            {
                return i;
            }
        }
        return -1;
    }
    public int call(int[] nums, int i)
    {
        int sum = 0;
        for(int j = 0; j < i; j++)
        {
            sum += nums[j];
        }
        return sum;
    }
    public int calr(int[] nums, int i)
    {
        int sum = 0;
        for(int j = i+1; j < nums.length; j++)
        {
            sum += nums[j];
        }
        return sum;
    }  
}
*/
class Solution {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {   //sum == total - nums[i] - sum
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
