class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        int n = nums.length;

        for(int i = 0; i <= n - 4; i++){
            for(int j = i + 1; j <= n - 3; j++){
                for(int k = j + 1; k <= n - 2; k++){
                    for(int m = k + 1; m <= n - 1; m++){
                        if(nums[i] +nums[j] + nums[k] == nums[m]){
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
