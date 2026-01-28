class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int low = 0;
        for ( int fast = 0;fast < n;fast++)
        {
            if(nums[fast] != val)
            {
                nums[low++] = nums[fast];
            }
        }
        return low++;
    }
}
/**
法一：
class Solution {
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int x : nums) {
            if (x != val) nums[idx++] = x;
        }
        return idx;
    }
}
法二：
class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
 */