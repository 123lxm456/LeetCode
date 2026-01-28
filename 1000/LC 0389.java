class Solution {
    public char findTheDifference(String s, String t) {
        int[] num = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            char temp = s.charAt(i);
            num[temp - 'a']++;
        }
        for(int i = 0; i < t.length(); i++)
        {
            char temp = t.charAt(i);
            num[temp - 'a']--;
        }
        for(int i = 0; i < t.length()-1; i++)
        {
            char temp = t.charAt(i);
            if(num[temp - 'a'] == -1)
            {
                return temp;
            }
        }
        return t.charAt(t.length() - 1);
    }
}
/**
class Solution {
    public char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            cnt[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }
}
 */

 /**
 //新方法：
class Solution {
    public char findTheDifference(String s, String t) {
        int as = 0, at = 0;
        for (int i = 0; i < s.length(); ++i) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            at += t.charAt(i);
        }
        return (char) (at - as);
    }
}
*/