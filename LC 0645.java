class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n + 1];
        int[] num = new int[2];
        for(int i = 0; i < n; i++)
        {
            temp[nums[i]]++;
        }
        for(int i = 1; i < (n+1); i++)
        {
            if(temp[i] == 2 || temp[i] == 0)
            {
                if(temp[i] == 2)
                {
                    num[0] = i;
                }
                if(temp[i] == 0)
                {
                    num[1] = i;
                }
            }
        }
        return num;
    }
}
/**
//先排序
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] errorNums = new int[2];
        int n = nums.length;
        Arrays.sort(nums);
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            if (curr == prev) {
                errorNums[0] = prev;
            } else if (curr - prev > 1) {
                errorNums[1] = prev + 1;
            }
            prev = curr;
        }
        if (nums[n - 1] != n) {
            errorNums[1] = n;
        }
        return errorNums;
    }
}
 */