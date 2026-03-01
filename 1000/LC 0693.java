class Solution {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        for(int i = 0; i < str.length() - 1; i++)
        {
            Character pre = str.charAt(i);
            Character cur = str.charAt(i + 1);
            if(pre == cur)
            {
                return false;
            }
        }
        return true;
    }
}
/**
class Solution {
    public boolean hasAlternatingBits(int n) {
        int a = n ^ (n >> 1);
        return (a & (a + 1)) == 0;
    }
}
 */

/**
//对 2 取模再除以 2 的方法
class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = 2;
        while (n != 0) {
            int cur = n % 2;
            if (cur == prev) {
                return false;
            }
            prev = cur;
            n /= 2;
        }
        return true;
    }
}
*/
