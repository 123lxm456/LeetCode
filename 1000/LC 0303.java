class NumArray {
    public int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int n = left,sum = 0;
        while(n <= right)
        {
            sum += nums[n];
            n++;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

 /**
 法二：前缀和
 class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
  */