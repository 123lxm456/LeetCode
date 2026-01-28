class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int k = 0;
        if(nums.length == 0)
        {
            return list;
        }
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i-1] + 1)
            {
                if(k == (i - 1))
                {
                    String str = Integer.toString(nums[k]);
                    list.add(str);
                }
                else
                {
                    String str = nums[k] + "->" + nums[i - 1];
                    list.add(str);
                }
                k = i;
            }
        }
        if(k == nums.length - 1)
        {
            String str = Integer.toString(nums[k]);
            list.add(str);
        }
        else
        {
            String str = nums[k] + "->" + nums[nums.length - 1];
            list.add(str);
        }
        return list;
    }
}