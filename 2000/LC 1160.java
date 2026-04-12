class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charscount = new int[26];
        for(char num:chars.toCharArray())
        {
            charscount[num - 'a']++;
        }
        int sum = 0;
        for(String word:words)
        {
            int[] wordcount = new int[26];
            for(char num:word.toCharArray())
            {
                wordcount[num - 'a']++;
            }
            boolean istrue = true;
            for(char num:word.toCharArray())
            {
                if(wordcount[num-'a'] > charscount[num - 'a'])
                {
                    istrue = false;
                    break;
                }
            }
            if(istrue)
            {
                sum += word.length();
            }
        }
        return sum;
    }
}
