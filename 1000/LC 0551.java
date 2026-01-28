class Solution {
    public boolean checkRecord(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'A')
            {
                num++;
                if(num == 2)
                {
                    return false;
                }
            }
        }
        for(int i = 0; i < s.length() - 2; i++)
        {
            if(s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
            {
                return false;
            }
        }
        return true;
    }
}
/**
//法一：
class Solution {
    public boolean checkRecord(String s) {
        int absents = 0, lates = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                absents++;
                if (absents >= 2) {
                    return false;
                }
            }
            if (c == 'L') {
                lates++;
                if (lates >= 3) {
                    return false;
                }
            } else {
                lates = 0;
            }
        }
        return true;
    }
}
*/

/**
//法二：
class Solution {
    public boolean checkRecord(String s) {
        int cntA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' && ++cntA > 1) {
                return false;
            }
        }
        return !s.contains("LLL");
    }
}
 */