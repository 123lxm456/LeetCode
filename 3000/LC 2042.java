class Solution {
    public boolean areNumbersAscending(String s) {
        String[] strs = s.split(" ");
        int pre = -1, cur  = -1;
        for(String str:strs){
            if(fun(str)){
                cur = Integer.parseInt(str);
                if(cur <= pre){
                    return false;
                }
                else{
                    pre = cur;
                }
            }
        }
        return true;
    }
    public boolean fun(String str){
        for(char num:str.toCharArray()){
            if(num >= 'a' && num <= 'z'){
                return false;
            }
        }
        return true;
    }
}

/**
class Solution {
    public boolean areNumbersAscending(String s) {
        int pre = 0, pos = 0;
        while (pos < s.length()) {
            if (Character.isDigit(s.charAt(pos))) {
                int cur = 0;
                while (pos < s.length() && Character.isDigit(s.charAt(pos))) {
                    cur = cur * 10 + s.charAt(pos) - '0';
                    pos++;
                }
                if (cur <= pre) {
                    return false;
                }
                pre = cur;
            } else {
                pos++;
            }
        }
        return true;
    }
}

*/