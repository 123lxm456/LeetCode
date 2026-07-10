
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] nums1 = new int[26];
        int[] nums2 = new int[26];

        for(char word:word1.toCharArray()){
            nums1[word - 'a']++;
        }
        for(char word:word2.toCharArray()){
            nums2[word - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(Math.abs(nums1[i] - nums2[i]) > 3){
                return false;
            }
        }
        return true;
    }
}

/*
//更优的思路
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] count = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i) - 'a']++;
            count[word2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (Math.abs(count[i]) > 3) {
                return false;
            }
        }
        return true;

    }
}
*/