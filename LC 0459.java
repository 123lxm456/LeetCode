class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length(),k = 0;
        if(n == 1)
        {
            return false;
        }
        while(k < (n / 2))
        {
            String sub = s.substring(0,k+1);
            if((n % (k+1)) != 0 )
            {
                k++;
                continue;
            }
            int i;
            for(i = k+1; i < n ;i = i+k+1)
            {
                String current = s.substring(i,k + i + 1);
                if(!current.equals(sub))
                {
                    k++;
                    break;
                }
            }
            if(i == n)
            {
                return true;
            }
        }
        return false;
    }
}
*/

/**
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }
}

 */
