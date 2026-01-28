class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        // 1. 计算第一个窗口的和（用int避免浮点精度问题，最后再除）
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        // 初始化最大和（用和而非平均值，减少浮点运算）
        int maxSum = windowSum;
        
        // 2. 滑动窗口遍历剩余部分
        for (int i = k; i < n; i++) {
            // 移出左端元素，移入右端元素
            windowSum = windowSum - nums[i - k] + nums[i];
            // 更新最大和
            maxSum = Math.max(maxSum, windowSum);
        }
        
        // 3. 最后计算平均值（仅一次浮点运算）
        return (double) maxSum / k;
    }
}