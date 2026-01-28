class Solution {
    public boolean isSubsequence(String s, String t) {
        int left1 = 0, left2 = 0;
        while(left1 < s.length() && left2 < t.length())
        {
            if(s.charAt(left1) == t.charAt(left2))
            {
                left1++;
                left2++;
            }
            else
            {
                left2++;
            }
        }
        if(left1 < s.length())
        {
            return false;
        }
        return true;
    }
}
/**
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}
 */

 /**
//动态规划：（没看懂）
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();

        int[][] f = new int[m + 1][26];
        for (int i = 0; i < 26; i++) {
            f[m][i] = m;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a')
                    f[i][j] = i;
                else
                    f[i][j] = f[i + 1][j];
            }
        }
        int add = 0;
        for (int i = 0; i < n; i++) {
            if (f[add][s.charAt(i) - 'a'] == m) {
                return false;
            }
            add = f[add][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }
}
  */
