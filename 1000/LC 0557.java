class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int k = 0;
        for(int i = 0; i < s.length(); i = i + k + 1)
        {
            int j = i;
            k = 0;
            while(j < s.length() && chars[j] != ' ')
            {
                k++;
                j++;
            }
            swap(chars, i, j-1);
        }
        return new String(chars);
    }
    public void swap(char[] chars,int left, int right)
    {
        char temp;
        while(left < right)
        {
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
/**
class Solution {
    public String reverseWords(String s) {
        StringBuffer ret = new StringBuffer();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }
}
 */
