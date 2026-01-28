class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] s1 = s.toCharArray();
        List<Character> s2 = new ArrayList<>();
        for(char str:s1)
        {
            if(str >= 'a' && str <= 'z' || str>='0'&&str<='9')
            {
                s2.add(str);
            }
        }
        return fun(s2);
    }
    public boolean fun(List s)
    {
        int n = s.size();
        for(int i = 0; i < n/2; i++)
        {
            if(s.get(i) != s.get(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
/**
class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }
}
 */