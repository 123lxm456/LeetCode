class Solution {
    public String modifyString(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char num = s.charAt(i);
            if(num >= 'a' && num <= 'z'){
                str.append(num);
            }
            else{
                for(char c = 'a'; c <= 'z'; c++){
                    boolean left = true;
                    boolean right = true;
                    if(i > 0 && c == str.charAt(i -1)){ //用了 s.charAt(i-1)，但左边已经被改成新字符了,左边可能不是原来的 s 里的字符，而是刚替换好的字符,必须用 str 里的字符，不能用原字符串 s！
                        left = false;
                    }
                    if(i < s.length() - 1 && c == s.charAt(i+1)){
                        right = false;
                    }
                    if(left && right){
                        str.append(c);
                        break;
                    }
                }
            }
        }
        return str.toString();
    }
}


/**
class Solution {
    public String modifyString(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; ++i) {
            if (arr[i] == '?') {
                for (char ch = 'a'; ch <= 'c'; ++ch) {
                    if ((i > 0 && arr[i - 1] == ch) || (i < n - 1 && arr[i + 1] == ch)) {
                        continue;
                    }
                    arr[i] = ch;
                    break;
                }
            }
        }
        return new String(arr);
    }
}
*/
