
class Solution {
    public boolean buddyStrings(String s, String goal) {
        int m = s.length();
        int n = goal.length();
        if(m != n)
        {
            return false;
        }
        int[] count = new int[26];
        int first = -1, second = -1;
        for(int i = 0; i < m; i++)
        {
            char sc = s.charAt(i);
            char gc = goal.charAt(i);
            count[sc - 'a']++;
            if(sc != gc)
            {
                if(first == -1)
                {
                    first = i;
                }
                else if(second == -1)
                {
                    second = i;
                }
                else
                {
                    return false;
                }
            }
        }
        if(first == -1)
        {
            for(int c:count)
            {
                if(c >= 2)
                {
                    return true;
                }
            }
            return false;
        }
        if(second == -1)
        {
            return false;
        }
        return s.charAt(first) == goal.charAt(second) && 
        s.charAt(second) == goal.charAt(first);
    }
}

/*
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        if (s.equals(goal)) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                if (count[s.charAt(i) - 'a'] > 1) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < goal.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }

            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first));
        }
    }
}
*/
