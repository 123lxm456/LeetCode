class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] nums = new int[n + 1];
        for(int i = 1; i < n + 1;i++){
            nums[i] = nums[ i - 1] + gain[i - 1];
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}

/**
class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0, sum = 0;
        for (int x : gain) {
            sum += x;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}

*/
