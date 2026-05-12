class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        
        // 按顺序遍历，逐个插入
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        
        // 把 List 转成 int[] 返回
        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            target[i] = list.get(i);
        }
        
        return target;
    }
}