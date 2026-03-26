class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int wordslen = words.length;
        int[] ord = new int[26];
        for(int i = 0; i < 26; i++)
        {
            char num = order.charAt(i);
            ord[num - 'a'] = i; 
        }
        for(int i = 0; i < wordslen - 1; i++)
        {
            String pre = words[i];
            String cur = words[i + 1];
            int len = Math.min(pre.length(), cur.length());
            boolean ispre = true;
            for(int j = 0; j < len; j++)
            {
                int x1 = ord[pre.charAt(j) - 'a'];
                int x2 = ord[cur.charAt(j) - 'a'];
                if(x1 > x2)
                {
                    return false;
                }
                else if(x1 < x2)
                {
                    ispre = false;
                    break;
                }
            }
            if(ispre && pre.length() > cur.length())
            {
                return false;
            }
        }
        return true;
    }
}

/**
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0; i < order.length(); ++i) {
            index[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            boolean valid = false;
            for (int j = 0; j < words[i - 1].length() && j < words[i].length(); j++) {
                int prev = index[words[i - 1].charAt(j) - 'a'];
                int curr = index[words[i].charAt(j) - 'a'];
                if (prev < curr) {
                    valid = true;
                    break;
                } else if (prev > curr) {
                    return false;
                }
            }
            if (!valid) {
                if (words[i - 1].length() > words[i].length()) {
                    return false;
                }
            }
        }
        return true;
    }
}

*/
