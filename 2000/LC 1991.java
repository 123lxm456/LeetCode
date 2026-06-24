class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int left = 0, right = 0;
            for(int j = 0; j < i; j++){
                left += nums[j];
            }
            for(int j = i + 1; j < n; j++){
                right += nums[j];
            }
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}

/**
class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}

*/
