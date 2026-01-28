/*
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.containsKey(num) ? map.get(num)+1:1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > (nums.length / 2))
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}
*/
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

