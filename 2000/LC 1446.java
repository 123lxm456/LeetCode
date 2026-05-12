class Solution {
    public int maxPower(String s) {
        int n = s.length(), max = 1, count = 1;
        char pre = s.charAt(0), cur = s.charAt(0);
        for(int i = 1; i < n; i++)
        {
            cur = s.charAt(i);
            if(cur == pre){
                count++;
            }
            else
            {
                max = Math.max(max, count);
                count = 1;
            }
            pre = cur;
        }
        max = Math.max(max, count);
        return max;
    }
}

/**
//最优
class Solution {
    public int maxPower(String s) {
        int ans = 1, cnt = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ++cnt;
                ans = Math.max(ans, cnt);
            } else {
                cnt = 1;
            }
        }
        return ans;
    }
}

*/