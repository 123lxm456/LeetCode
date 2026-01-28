class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        for(int i = 0; i < nums.length; i=i+2)
        {
            num += nums[i];
        }
        return num;
    }
}
//我们每次选择都想选个大的，但是最大的不能选（因为 min），所以每次选第二大的。
