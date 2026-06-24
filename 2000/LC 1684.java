class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char num:allowed.toCharArray()){
            set.add(num);
        }
        int count = 0;
        for(int i = 0; i < words.length; i++){
            boolean exist = true;
            for(char num:words[i].toCharArray()){
                if(!set.contains(num)){
                    exist = false;
                }
            }
            if(exist){
                count++;
            }
        }
        return count;
    }
}

/**
//位运算
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // 位掩码，二进制位标记允许出现的字符
        int mask = 0;
        // 遍历允许字符，对应二进制位置1
        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            // c-'a'映射为0-25，左移对应位数，按位或存入掩码
            mask |= 1 << (c - 'a');
        }

        int res = 0;
        // 遍历所有单词逐个校验
        for (String word : words) {
            // 记录当前单词包含的字符掩码
            int wordMask = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                wordMask |= 1 << (c - 'a');
            }
            // 或运算后等于原允许掩码，说明单词无额外非法字符
            if ((wordMask | mask) == mask) {
                res++;
            }
        }
        return res;
    }
}
*/
