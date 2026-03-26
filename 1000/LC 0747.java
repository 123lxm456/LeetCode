class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int[] newnums = new int[n];
        for(int i = 0; i < n; i++)
        {
            newnums[i] = nums[i];
        }
        Arrays.sort(newnums);
        if(newnums[n-2] * 2 > newnums[n - 1])
        {
            return -1;
        }
        for(int i = 0; i < n-1; i++)
        {
            if(nums[i] == newnums[n - 1])
            {
                return i;
            }
        }
        return n-1;
    }
}