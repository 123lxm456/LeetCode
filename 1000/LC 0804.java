class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int n = words.length;
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            String str = fun(words[i]);
            set.add(str);
        }
        return set.size();
    }
    public String fun(String word)
    {
        String[] nums = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < word.length(); i++)
        {
            char num = word.charAt(i);
            str.append(nums[num - 'a']);
        }
        return str.toString();
    }
}
