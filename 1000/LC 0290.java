class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        int length = pattern.length();
        if(str.length != length)
        {
            return false;
        }
        Map<Character,String> map1 = new HashMap<>(); 
        Map<String,Character> map2 = new HashMap<>(); 
        for(int i = 0; i < length; i++)
        {
            Character s1 = pattern.charAt(i);
            String t = str[i];
            if(map1.containsKey(s1) && !(map1.get(s1).equals(t)) || 
            map2.containsKey(t) && !(map2.get(t) == s1))
            {
                return false;
            }
            map1.put(s1,t);
            map2.put(t,s1);
        }
        return true;
    }
}