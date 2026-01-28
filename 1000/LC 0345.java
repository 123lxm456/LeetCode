class Solution {
    public String reverseVowels(String s) {
        int left = 0,right = s.length() - 1;
        char[] str = s.toCharArray();
        while(left < right)
        {
            if(yuanyin(s.charAt(left)))
            {
                if(yuanyin(s.charAt(right)))
                {
                    char temp;
                    temp = str[left];
                    str[left] = str[right];
                    str[right] = temp;
                    left++;
                }
                right--;
            }
            else
            {
                left++;
            }
        }
        return new String(str);
    }
    public boolean yuanyin(char t)
    {
        if(t == 'a' || t == 'e' || t =='i' || t == 'o' || t == 'u'
        || t == 'A' || t == 'E' || t =='I' || t == 'O' || t == 'U')
        {
            return true;
        }
        return false;
    }
}