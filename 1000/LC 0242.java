class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        int m,n;
        m = s.length();
        n = t.length();
        if(m != n)
        {
            return false;
        }
        for(int i = 0; i < m; i++)
        {
            Character a = s.charAt(i);
            if(map1.containsKey(a))
            {
                map1.put(a,map1.get(a)+1);
            }
            else
            {
                map1.put(a,1);
            }
        }
        for(int i = 0; i < n; i++)
        {
            Character a = t.charAt(i);
            if(map2.containsKey(a))
            {
                map2.put(a,map2.get(a)+1);
            }
            else
            {
                map2.put(a,1);
            }
        }
        if(map1.equals(map2))
        {
            return true;
        }
        return false;
    }
}
/**
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}

法二：
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

 */