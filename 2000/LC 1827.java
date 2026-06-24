class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            if(nums[i + 1] <= nums[i]){
                count = count + (nums[i] - nums[i + 1] + 1);
                nums[i + 1] = nums[i] + 1; 
            }
        }
        return count;
    }
}


/**
//当前合法最小值 = 上一个值 + 1
//pre：前一位最终修改后的数值
//要求：当前数 ≥ pre+1 才合法；不够就抬到 pre+1
class Solution {
    public int minOperations(int[] nums) {
        // pre初始：第一个数前面虚拟值 = nums[0]-1
        int pre = nums[0] - 1, res = 0;
        for (int num : nums) {
            // 二选一：要么不动原值num，要么抬到 pre+1
            pre = Math.max(pre + 1, num);
            // pre-num 就是这个数字需要加多少次
            res += pre - num;
        }
        return res;
    }
}
*/
