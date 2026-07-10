class Solution {
    public int countValidWords(String sentence) {
        int count = 0;
        String[] strs = sentence.trim().split("\\s+");
        for(String str:strs){
            if(judge(str)){
                count++;
            }
        }
        return count;
    }
    public boolean judge(String str){
        int n = str.length();
        int count1 = 0, count2 = 0, index = -1;
        for(int i = 0; i < n; i++){
            char s = str.charAt(i);

            if(s >= 'a' && s <= 'z'){
                continue;
            }
            else if(Character.isDigit(s)){
                return false;
            }
            else if(s == '-'){
                count1++;
                if(count1 > 1){
                    return false;
                }
                index = i;
            }
            else{
                if(i != n - 1){
                    return false;
                }
            }
        }
        if(count1 == 1){
            if(index == 0 || index == (n - 1)){
                return false;
            }
            else{
                char left = str.charAt(index - 1);
                char right = str.charAt(index + 1);
                if(!(left >= 'a' && left <= 'z' && right >= 'a' && right <= 'z'))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
