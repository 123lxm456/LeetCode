class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        while(i < n){
            ans[i] = nums[nums[i]];
            i++;
        }
        return ans;
    }
}
