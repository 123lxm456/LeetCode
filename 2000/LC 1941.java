
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] nums = new int[26];
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char str = s.charAt(i);
            nums[str - 'a'] ++;
            if(i == s.length() - 1)
            {
                count = nums[str - 'a'];
            }
        }
        for(int i = 0; i < 26; i++){
            if(nums[i] > 0 && nums[i] != count){
                return false;
            }
        }
        return true;
    }
}

/*
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        // 统计每个字符出现次数
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        // 理论上每个字符应该出现的次数
        int occ = s.length() / freq.size();
        // 遍历校验
        for (int v : freq.values()) {
            if (v != occ) {
                return false;
            }
        }
        return true;
    }
}
*/
