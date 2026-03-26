class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] minCount = new int[26];
        for(char num:words[0].toCharArray())
        {
            minCount[num - 'a']++;
        }
        for(int i = 1; i < words.length; i++)
        {
            int[] curCount = new int[26];
            for(char num:words[i].toCharArray())
            {
                curCount[num - 'a']++;
            }
            for(int j = 0; j < 26; j++)
            {
                minCount[j] = Math.min(minCount[j], curCount[j]);
            }
        }
        for(int j = 0; j < 26; j++)
        {
            while(minCount[j] > 0)
            {
                list.add(String.valueOf((char)(j + 'a')));
                minCount[j]--;
            }
        }
        return list;
    }
}