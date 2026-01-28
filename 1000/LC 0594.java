class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num) + 1);
            }
            else
            {
                map.put(num,1);
            }
        }
        int max = 0;
        for(int num:map.keySet())
        {
            if(map.containsKey(num + 1))
            {
                int k = map.get(num) + map.get(num + 1);
                if(k > max)
                {
                    max = k;
                }
            }
        }
        return max;
    }
}