
class Solution {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        int n1 = haystack.length(),n2 = needle.length(),j;
        for(int i = 0; i <= (n1 - n2); i++)
        {
            for(j = 0; j < n2;j++)
            {
                if(haystack.charAt(i + j) != needle.charAt(j))
                {
                    break;
                }
            }
            if(j == n2)
            {
                return i;
            }
        }
        return -1;
    }
}

/*
class Solution {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        int n1 = haystack.length(),n2 = needle.length();
        for(int i = 0; i <= n1-n2; i++)
        {
            String num = haystack.substring(i,i+n2);
            if(num.equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}
 */