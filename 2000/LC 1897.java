class Solution {
    public boolean makeEqual(String[] words) {
        int[] nums = new int[26];
        for(int i = 0; i < words.length; i++){
            for(char s:words[i].toCharArray()){
                nums[s - 'a']++;
            }
        }
        for(int i = 0; i < 26; i++){
            if(nums[i] % words.length != 0){
                return false;
            }
        }
        return true;
    }
}