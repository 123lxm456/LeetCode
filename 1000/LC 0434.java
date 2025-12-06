/*
class Solution {
    public int countSegments(String s) {
        int k = 0,n = s.length();
        int index = 0;
        if(n == 1)
        {
            if(s.charAt(0) != ' ')
            {
                return 1;
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) != ' ' && index == i)
            {
                k++;
            }
            if(s.charAt(i) == ' ')
            {
                index = i+1;
            }
        }
        return k;
    }
}
*/

class Solution {
    public int countSegments(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }
}



