class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int total = Arrays.stream(nums).sum(), sum = 0;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0; i--){
            sum += nums[i];
            list.add(nums[i]);
            if(sum > (total - sum)){
                break;
            }
        }
        return list;
    }
}
