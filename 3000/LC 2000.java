class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        StringBuilder newstr = new StringBuilder();
        int i = 0;
        for(i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                str.append(word.charAt(i));
                if(i == word.length() - 1){
                    newstr.append(str.reverse().toString());
                }
                else{
                    newstr.append(str.reverse().toString() + word.substring(i+1, word.length()));
                }
                break;
            }
            else{
                str.append(word.charAt(i));
            }
        }
        return i == word.length()?word:newstr.toString();
    }
}

/**
//最优：直接反转
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index >= 0) {
            char[] arr = word.toCharArray();
            int left = 0, right = index;
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            word = new String(arr);
        }
        return word;
    }
}

*/
