class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length, count  = 0, k = 0;
        for(int i = 0; i < n; i = i + 2)
        {
            count += nums[i];
        }
        int[] result = new int[count];
        for(int i = 1; i < n; i = i + 2)
        {
            int num = nums[i - 1];
            for(int j = 0; j < num; j++)
            {
                result[k++] = nums[i];
            }
        }
        return result;
    }
}
