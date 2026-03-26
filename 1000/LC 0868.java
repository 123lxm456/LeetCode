class Solution {
    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int pre = 0, cur = 0,max = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '1')
            {
                cur = i;
                int num = cur - pre;
                max = Math.max(max,num);
                pre = cur;
            }
        }
        return max;
    }
}
/**
//位运算
class Solution {
    public int binaryGap(int n) {
        int last = -1, ans = 0;
        for (int i = 0; n != 0; ++i) {
            if ((n & 1) == 1) {
                if (last != -1) {
                    ans = Math.max(ans, i - last);
                }
                last = i;
            }
            n >>= 1;
        }
        return ans;
    }
}

*/
