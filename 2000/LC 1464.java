class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            nums[i] = nums[i] - 1;
        }
        Arrays.sort(nums);
        int num1 = nums[0] * nums[1];
        int num2 = nums[n-1] * nums[n-2];
        return Math.max(num1, num2);
    }
}