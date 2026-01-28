class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        if(strs == null || strs.length == 0)
        {
            return "";
        }
        for (int i = 1; i < strs.length; i++)
        {
            while(strs[i].indexOf(pre) != 0)
            {
                pre = pre.substring(0,pre.length()-1);
            }
        }
        return pre;
    }
}
/*
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s0 = strs[0];
        for (int j = 0; j < s0.length(); j++) { // 从左到右
            char c = s0.charAt(j);
            for (String s : strs) { // 从上到下
                if (j == s.length() || s.charAt(j) != c) { // 这一列有字母缺失或者不同
                    return s0.substring(0, j); // 0 到 j-1 是公共前缀
                }
            }
        }
        return s0;
    }
}
*/