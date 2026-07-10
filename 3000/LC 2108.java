class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(find(word)){
                return word;
            }
        }
        return "";
    }

    public boolean find(String word){
        char[] arr = word.toCharArray();
        int n = arr.length;
        for(int i = 0; i < (n/2);i++){
            if(arr[i] != arr[n - i - 1]){
                return false;
            }
        }
        return true;
    }
}
