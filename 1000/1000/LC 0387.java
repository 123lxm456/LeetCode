/*
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length();i++)
        {
            char t = s.charAt(i);
            if(map.containsKey(t))
            {
                map.put(t,map.get(t) + 1);
            }
            else
            {
                map.put(t,1);
            }
        }
        for(int i = 0; i < s.length(); i++)
        {
            char t = s.charAt(i);
            if(map.get(t) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
*/

class Solution {
    public int firstUniqChar(String s) {
        int[] num= new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            char t = s.charAt(i);
            num[t - 'a']++;
        }
        for(int i = 0; i < s.length(); i++)
        {
            char t = s.charAt(i);
            if(num[t - 'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
