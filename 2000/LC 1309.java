class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();
        int k = n-1;
        while(k >= 0)
        {
            if(s.charAt(k) == '#')
            {
                int num = (s.charAt(k-2) - '0') * 10 + (s.charAt(k - 1) - '0');
                str.append((char) ('a' + num - 1));
                k = k - 3;
            }
            else
            {
                str.append((char)('a' + (s.charAt(k) - '0') - 1));
                k--;
            }
        }
        return str.reverse().toString();
    }
}
