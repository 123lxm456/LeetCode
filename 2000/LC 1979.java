class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0], max = nums[nums.length- 1];
        return gcd(min, max);
    }
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
