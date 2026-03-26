class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] num = fun(licensePlate);
        String str = "";
        for(int i = 0; i < words.length; i++)
        {
            int[] nums = fun(words[i]);
            int f = 1;
            for(int j = 0; j < 26; j++)
            {
                if(num[j] > 0)
                {
                    if(nums[j] < num[j])
                    {
                        f = 0;
                        break;
                    }
                }
            }
            if(f == 1)
            {
                if(str.length() == 0)
                {
                    str = words[i];
                }
                else if(words[i].length() < str.length())
                {
                    str = words[i];
                }
            }
        }
        return str;
    }
    public int[] fun(String str)
    {
        int[] temp = new int[26];
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                temp[ch - 'a']++;
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                temp[ch - 'A']++;
            }
        }
        return temp;
    }
}
