class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        {
            return false;
        }
        return (s+s).contains(goal);
    }
}
/**
//面试常考的基础写法
//比如 s=abcde，旋转 2 次后的起点是索引 2（字符 'c'），序列为 c d e a b，对应 (2+0)%5=2、(2+1)%5=3、(2+2)%5=4、(2+3)%5=0、(2+4)%5=1。
//通过 (i + j) % n 这个取模运算，实现 “从索引 i 开始循环遍历 s 的字符”，完美模拟旋转效果。
class Solution {
    public boolean rotateString(String s, String goal) {
        int m = s.length(), n = goal.length();
        if (m != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (s.charAt((i + j) % n) != goal.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}

*/
