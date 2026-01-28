/*
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        Map<Character,Character> stot = new HashMap<>();
        Map<Character,Character> ttos = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(stot.containsKey(s1))
            {
                if(stot.get(s1) != t1)
                {
                    return false;
                }
            }
            else
            {
                if(ttos.containsKey(t1))
                {
                    return false;
                } 
                stot.put(s1,t1);
                ttos.put(t1,s1);
            }
        }
        return true;
    }
}
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<Character, Character>();
        Map<Character, Character> t2s = new HashMap<Character, Character>();
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }
}