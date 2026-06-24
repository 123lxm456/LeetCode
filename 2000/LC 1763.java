class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String str = "";

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                String cur = s.substring(i,j + 1);
                if(good(cur)){
                    if(cur.length() > str.length()){
                        str = cur;
                    }
                }
            }
        }
        return str;
    }
    public boolean good(String str){
        int[] nums1 = new int[26];
        int[] nums2 = new int[26];
        for(char num:str.toCharArray()){
            if(num >= 'a' && num <= 'z'){
                nums1[num - 'a']++;
            }
            else{
                nums2[num - 'A']++;
            }
            
        }
        for(int i = 0; i < 26; i++){
            if(nums1[i] == 0 && nums2[i] != 0 || nums1[i] != 0 && nums2[i] == 0){
                return false;
            }
        }
        return true;
    }
}


/**
class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        int maxPos = 0;
        int maxLen = 0;
        for (int i = 0; i < n; ++i) {
            int lower = 0;
            int upper = 0;
            for (int j = i; j < n; ++j) {
                if (Character.isLowerCase(s.charAt(j))) {
                    lower |= 1 << (s.charAt(j) - 'a');
                } else {
                    upper |= 1 << (s.charAt(j) - 'A');
                }
                if (lower == upper && j - i + 1 > maxLen) {
                    maxPos = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(maxPos, maxPos + maxLen);
    }
}

*/
