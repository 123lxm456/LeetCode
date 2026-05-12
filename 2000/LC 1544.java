class Solution {
    public String makeGood(String s) {
        int i = 0;
        while(i < s.length() - 1){
            char cur = s.charAt(i);
            if((char)(cur+32) == s.charAt(i+1) && (cur >= 'A' && cur <= 'Z') 
            || (char)(cur-32) == s.charAt(i+1) && (cur >= 'a' && cur <= 'z') ){
                s = s.substring(0,i) + s.substring(i+2);
                if(i > 0){
                    i--;
                }
            }
            else
            {
                i++;
            }
        }
        return s;
    }
}



/**
class Solution {
    public String makeGood(String s) {
        StringBuffer ret = new StringBuffer();
        int retIndex = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ret.length() > 0 && Character.toLowerCase(ret.charAt(retIndex)) == Character.toLowerCase(ch) && ret.charAt(retIndex) != ch) {
                ret.deleteCharAt(retIndex);
                retIndex--;
            } else {
                ret.append(ch);
                retIndex++;
            }
        }
        return ret.toString();
    }
}
*/
