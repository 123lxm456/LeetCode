
class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder s = new StringBuilder();
        String[] nums = title.split(" ");
        for(String num:nums){
            if(num.length() >  2){
                s.append((Character.toUpperCase(num.charAt(0))) + (num.substring(1, num.length()).toLowerCase()));
            }
            else{
                s.append(num.toLowerCase());
            }
            s.append(" ");
        }
        return s.toString().trim();
    }
}

/*
//最优
class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder(title);
        int n = title.length();
        int l = 0, r = 0;   // 单词左右边界（左闭右开）
        while (r < n) {
            while (r < n && sb.charAt(r) != ' ') {
                ++r;
            }
            // 对于每个单词按要求处理
            if (r - l > 2) {
                sb.setCharAt(l, Character.toUpperCase(sb.charAt(l)));
                ++l;
            }
            while (l < r) {
                sb.setCharAt(l, Character.toLowerCase(sb.charAt(l)));
                ++l;
            }
            l = r + 1;
            ++r;
        }
        return sb.toString();
    }
}
*/
