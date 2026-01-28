class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length(),k=0;
        for(int i = n-1;i >= 0; i--)
        {
            if(s.charAt(i) == ' ')
            {
                if(k!=0)
                {
                    break;
                }
            }
            else
            {
                k++;
            }
        }
        return k;
    }
}
/**
class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index--;
        }
        int wordLength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            wordLength++;
            index--;
        }
        return wordLength;
    }
}
 */