class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++){
            int j;
            for(j = 0; j < searchWord.length(); j++){
                if((arr[i].length() < searchWord.length()) || arr[i].charAt(j) != searchWord.charAt(j)){
                    break;
                }
            }
            if(j == searchWord.length()){
                return i+1;
            }
        }
        return -1;
    }
}
