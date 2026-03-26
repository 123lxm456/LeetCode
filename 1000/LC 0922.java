class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = 1, n = nums.length;
        while(even < n && odd < n)
        {
            while(even < n && nums[even] % 2 == 0)
            {
                even += 2;
            }
            while(odd < n && nums[odd] % 2 != 0)
            {
                odd += 2;
            }
            if(odd < n && even < n)
            {
                swap(nums, even, odd);
            }
        }
        return nums;
    }
    public void swap(int[] nums, int a, int b)
    {
        int temp;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

/**
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int j = 1;
        for (int i = 0; i < n; i += 2) {
            if (nums[i] % 2 == 1) {
                while (nums[j] % 2 == 1) {
                    j += 2;
                }
                swap(nums, i, j);
            }
        }   
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
*/
