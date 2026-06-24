class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        str.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
                if(count == 3){
                    count--;
                }
                else{
                    str.append(s.charAt(i));
                }
            }
            else{
                str.append(s.charAt(i));
                count = 1;
            }
        }
        return str.toString();
    }
}
/**
class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();   // 删除后的字符串
        // 遍历 s 模拟删除过程
        for (char ch : s.toCharArray()) {
            int n = res.length();
            if (n >= 2 && res.charAt(n - 1) == ch && res.charAt(n - 2) == ch) {
                // 如果 res 最后两个字符与当前字符均相等，则不添加
                continue;
            }
            // 反之则添加
            res.append(ch);
        }
        return res.toString();
    }
}

*/
