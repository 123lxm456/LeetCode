class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] str = new char[26];
        for(char num:sentence.toCharArray()){
            str[num - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(str[i] == 0){
                return false;
            }
        }
        return true;
    }
}