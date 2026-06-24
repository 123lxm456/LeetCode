class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first = 0, second = 0, target = 0;
        for(int i = 0; i < firstWord.length(); i++){
            char s = firstWord.charAt(i);
            first = first * 10 + s - 'a';
        }
        for(int i = 0; i < secondWord.length(); i++){
            char s = secondWord.charAt(i);
            second = second * 10 + s - 'a';
        }
        for(int i = 0; i < targetWord.length(); i++){
            char s = targetWord.charAt(i);
            target = target * 10 + s - 'a';
        }
        return first+second == target;
    }
}