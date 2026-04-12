class Solution {
    public int balancedStringSplit(String s) {
        int right = 0, left = 0, n = s.length(), count = 0;
        for(int i = 0; i < n; i++)
        {
            char num = s.charAt(i);
            if(num == 'R')
            {
                right++;
            }
            else
            {
                left++;
            }
            if(right == left)
            {
                count++;
                right = 0;
                left = 0;
            }
        }
        return count;
    }
}

/**
class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0, d = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                ++d;
            } else {
                --d;
            }
            if (d == 0) {
                ++ans;
            }
        }
        return ans;
    }
}

*/
