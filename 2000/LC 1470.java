class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left = 0, right = n, i = 0;
        int[] arr = new int[n*2];
        while(right < 2*n){
            arr[i++] = nums[left++];
            arr[i++] = nums[right++];
        }
        return arr;
    }
}

/**
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
*/
