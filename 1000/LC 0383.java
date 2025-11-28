class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < ransomNote.length(); i++)
        {
            char str = ransomNote.charAt(i);
            if(map.containsKey(str))
            {
                map.put(str,map.get(str) + 1);
            }
            else
            {
                map.put(str,1);
            }
        }
        for(int i = 0;i < magazine.length(); i++)
        {
            char t = magazine.charAt(i);
            if(map.containsKey(t))
            {
                map.put(t,map.get(t) - 1);
            }
        }
        for(Integer value:map.values())
        {
            if(value > 0)
            {
                return false;
            }
        }
        return true;
    }
}
/**
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
 */