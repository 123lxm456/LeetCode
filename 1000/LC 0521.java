class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))
        {
            return -1;
        }
        return Math.max(a.length(),b.length());
    }
}
/**
1、如果两个字符串完全相等，那么它们的所有子序列都互相包含，不存在 “独有” 的子序列，返回 -1。
2、如果两个字符串不相等，那么最长的特殊序列就是长度更长的那个字符串本身（因为长字符串不可能是短字符串的子序列，而自身一定是自己的子序列）；若长度相同但内容不同，任意一个字符串本身都是最长特殊序列，返回该长度即可。
 */
