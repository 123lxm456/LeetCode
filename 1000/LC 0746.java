/*
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return cost[0];
        }
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < n; i++)
        {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[n - 2], dp[n - 1]);
    }
}
*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // 1. 获取台阶总数（cost数组长度 = 台阶数）
        int n = cost.length;
        // 2. 初始化两个状态变量：
        // prev 代表到达第 i-2 阶顶部的最小花费
        // curr 代表到达第 i-1 阶顶部的最小花费
        int prev = 0, curr = 0;
        // 3. 遍历：i 表示“要到达的顶部位置”，从2到n（因为顶部在第n阶的位置，台阶是0~n-1）
        for (int i = 2; i <= n; i++) {
            // 4. 计算到达第i阶顶部的最小花费：
            // 方式1：从i-1阶爬1步上来 → 花费 curr + cost[i-1]（curr是到i-1顶部的花费，cost[i-1]是踩i-1阶的费用）
            // 方式2：从i-2阶爬2步上来 → 花费 prev + cost[i-2]（prev是到i-2顶部的花费，cost[i-2]是踩i-2阶的费用）
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            // 5. 滚动更新：为下一次循环准备
            prev = curr; // 原来的i-1顶部 → 新的i-2顶部
            curr = next; // 原来的i顶部 → 新的i-1顶部
        }
        // 6. 最终curr是到达第n阶顶部（楼梯总顶部）的最小花费
        return curr;
    }
}