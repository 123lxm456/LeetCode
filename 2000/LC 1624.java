class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1, num = 0;
        int n = s.length();
        for(int i = 0; i < n - 1; i++){
            char cur = s.charAt(i);
            for(int j = n - 1; j >= 0; j--){
                if(cur == s.charAt(j)){
                    num = j - i - 1;
                    max = Math.max(max, num);
                    break;
                }
            }
        }
        return max;
    }
}

/**
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex, -1);
        int maxLength = -1;
        for (int i = 0; i < s.length(); i++) {
            if (firstIndex[s.charAt(i) - 'a'] < 0) {
                firstIndex[s.charAt(i) - 'a'] = i;
            } else {
                maxLength = Math.max(maxLength, i - firstIndex[s.charAt(i) - 'a'] - 1);
            }
        }
        return maxLength;
    }
}
*/
