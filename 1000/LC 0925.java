class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int m = name.length(), n = typed.length();
        int i = 0, j = 0;
        if(m > n)
        {
            return false;
        }
        while(i < m && j < n)
        {
            if(typed.charAt(j) == name.charAt(i))
            {
                i++;
                j++;
            }
            else
            {
                if(i == 0)
                {
                    return false;
                }
                if(typed.charAt(j) == name.charAt(i - 1))
                {
                    j++;
                }
                else
                {
                    return false;
                }
            }
        }
        if(i < m)
        {
            return false;
        }
        while(j < n)
        {
            if(typed.charAt(j) != name.charAt(m - 1))
            {
                return false;
            }
            j++;
        }
        return true;
    }
}

/**
//最优：
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}

*/
