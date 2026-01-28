class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max1 = nums[0] * nums[1] * nums[n - 1];
        int max2 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        return Math.max(max1, max2);
    }
}
/*
首先将数组排序。

如果数组中全是非负数，则排序后最大的三个数相乘即为最大乘积；如果全是非正数，则最大的三个数相乘同样也为最大乘积。

如果数组中有正数有负数，则最大乘积既可能是三个最大正数的乘积，也可能是两个最小负数（即绝对值最大）与最大正数的乘积。
*/
