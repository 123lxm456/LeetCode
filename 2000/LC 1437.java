
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        boolean isone = false;
        for(int num:nums){
            if(num == 1 && !isone){
                isone = true;
                count = 0;
            }
            else if(num == 1 && isone){
                if(count < k){
                    return false;
                }
                else{
                    count = 0;
                }
            }
            else{
                count++;
            }
        }
        return true;
    }
}

/*
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int prev = -1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 1) {
                if (prev != -1 && i - prev - 1 < k) {
                    return false;
                }
                prev = i;
            }
        }
        return true;
    }
}
*/
