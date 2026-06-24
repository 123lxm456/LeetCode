
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int m = word1.length(), n = word2.length(), i = 0;
        for(i = 0; i < m && i < n; i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        while(i < n){
            str.append(word2.charAt(i));
            i++;
        }
        while(i < m){
            str.append(word1.charAt(i));
            i++;
        }
        return str.toString();
    }
}

/*
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int i = 0, j = 0;

        StringBuilder ans = new StringBuilder();
        while (i < m || j < n) {
            if (i < m) {
                ans.append(word1.charAt(i));
                ++i;
            }
            if (j < n) {
                ans.append(word2.charAt(j));
                ++j;
            }
        }
        return ans.toString();
    }
}
*/
