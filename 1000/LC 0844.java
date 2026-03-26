class Solution {
    public boolean backspaceCompare(String s, String t) {
        return fun(s).equals(fun(t));
    }
    public String fun(String s)
    {
        StringBuilder str1 = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char cur = s.charAt(i);
            if(cur == '#')
            {
                if(str1.length() > 0)
                {
                    str1.deleteCharAt(str1.length() - 1);
                }
            }
            else
            {
                str1.append(cur);
            }
        }
        return str1.toString();
    }
}
