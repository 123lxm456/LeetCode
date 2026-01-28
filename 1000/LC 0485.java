class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, k = 0;
        for(int i = 0; i < nums.length; i = i + k)
        {
            k = 0;
            if(nums[i] == 1)
            {
                k++;
                int j = i + 1;
                while(j < nums.length && nums[j] == 1 )
                {
                    k++;
                    j++;
                }
                if(k > max)
                {
                    max = k;
                }
            }
            else
            {
                i++;
            }
        }
        return max;
    }
}

/**
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
 */

 /**
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int cnt = 0;
        for (int x : nums) {
            if (x == 0) {
                cnt = 0; // 重置
            } else {
                cnt++; // 连续 1 的个数增加
                ans = Math.max(ans, cnt); // 更新答案的最大值
            }
        }
        return ans;
    }
}
  */