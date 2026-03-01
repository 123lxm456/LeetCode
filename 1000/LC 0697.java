class Solution {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        Map<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            int num = nums[i];
            if(map.containsKey(num))
            {
                int[] info = map.get(num);
                info[0]++;
                info[2] = i;
            }
            else
            {
                map.put(num, new int[]{1,i,i} );
            }
        }
        int maxcount = 0;
        int minlen = n;
        for(Map.Entry<Integer, int[]> entry : map.entrySet())
        {
            int[] info = entry.getValue();
            int count = info[0];
            int fir = info[1];
            int end = info[2];
            int len = end - fir + 1;
            if(count > maxcount)
            {
                maxcount = count;
                minlen = len;
            }
            else if(count == maxcount)
            {
                minlen = Math.min(minlen,len);
            }
        }
        return minlen;
    }
}
