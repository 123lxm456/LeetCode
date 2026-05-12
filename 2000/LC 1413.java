class Solution {
    public int minStartValue(int[] nums) {
        int pre = 0, minpre = Integer.MAX_VALUE;
        for(int num:nums){
            pre += num;
            minpre = Math.min(pre, minpre);
        }
        return Math.max(1, 1 - minpre);
    }
}

/**
要保证所有的累加和 accSum 满足 accSum+startValue≥1，只需保证累加和的最小值 accSumMin 满足 accSumMin+startValue≥1，那么 startValue 的最小值即可取 −accSumMin+1。
*/
