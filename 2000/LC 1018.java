class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int sum = 0;
        for(int num:nums)
        {
            sum = sum * 2 + num;
            if(sum % 5 == 0)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
            sum %= 5;
        }
        return list;
    }
}
/**
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int sum = 0;
        
        for (int num : nums) {
            // 核心：每次都 %5，防止溢出！
            sum = (sum * 2 + num) % 5;
            list.add(sum == 0);
        }
        return list;
    }
}
*/
