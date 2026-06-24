
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] ori = nums.clone();
        Arrays.sort(ori);
        for(int x = 0; x < n; x++){
            boolean match = true;
            for(int i = 0; i < n; i++){
                if(ori[i] != nums[(i + x + n) % n]){
                    match = false;
                }
            }
            if(match){
                return true;
            }
        }
        return false;
    }
}


/*
//检查数组是不是 有序数组的一次轮转，判断规则只有 2 条：整个数组最多只有一个地方出现 nums[i] > nums[i+1]；并且最后一个元素 ≤ 第一个元素
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // 比较当前和下一个（最后一个和第一个比）
            if (nums[i] > nums[(i+1)%n]) {
                count++;
            }
        }
        // 最多一个“下降点”，就是正确的旋转有序数组
        return count <= 1;
    }
}
*/