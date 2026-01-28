class Solution {
    public int titleToNumber(String columnTitle) {
        char[] nums = columnTitle.toCharArray();
        int sum=0;
        for(char num:nums)
        {
            sum = sum * 26 + (num - 'A' + 1);
        }
        return sum;
    }
}