class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currentwidth = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char num = s.charAt(i);
            if(widths[num - 'a'] <= (100 - currentwidth))
            {
                currentwidth += widths[num - 'a'];
            }
            else
            {
                lines++;
                currentwidth = widths[num - 'a'];
            }
        }
        return new int[]{lines,currentwidth};
    }
}
