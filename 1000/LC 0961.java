class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length, result = nums[0];
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry <Integer, Integer> entry:map.entrySet())
        {
            if(entry.getValue() == n/2)
            {
                result = entry.getKey();
            }
        }
        return result;
    }
}
/**
//最优
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> found = new HashSet<Integer>();
        for (int num : nums) {
            if (!found.add(num)) {
                return num;
            }
        }
        // 不可能的情况
        return -1;
    }
}
*/
