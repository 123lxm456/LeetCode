class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char str = s.charAt(i);
            if(map.containsKey(str))
            {
                map.put(str,map.get(str) + 1);
            }
            else
            {
                map.put(str,1);
            }
        }
        int sum = 0;
        int k = 0;
        for(Integer value:map.values())
        {
            if(value % 2 == 0)
            {
                sum += value;
            }
            else
            {
                k = 1;
                sum = sum + value - 1;
            }
        }
        if(k == 0)
        {
            return sum;
        }
        return sum + 1;
    } 
}
