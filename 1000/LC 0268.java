class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }
}



/*
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i;
        for(i = 0; i <= n; i++)
        {
            int f = 0;
            for(int j:nums)
            {
                if(i == j)
                {
                    f = 1;
                }
            }
            if(f == 0)
            {
                break;
            }        
        }
        return i;
    }
}
*/