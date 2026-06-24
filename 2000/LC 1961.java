class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder str = new StringBuilder();
        int m = s.length();
        int i = 0;
        for(String word:words){
            int n = word.length();
            if(n > (m - i)){
                return false;
            }
            else{
                if(!word.equals(s.substring(i, i + n))){
                    return false;
                }
            }
            i = i + n;
            if(i == m){
                return true;
            }
        }
        return false;
    }
}

/**
//最优
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int i = 0;
        int n = s.length();
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (i < n && ch == s.charAt(i)) {
                    i++;
                } else {
                    return false;
                }
            }
            if (i == n) {
                return true;
            }
        }
        return false;
    }
}
*/
