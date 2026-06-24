class Solution {
    public int minOperations(String s) {
        int n = s.length(), count1 = 0, count2 = 0;
        char[] str = s.toCharArray();
        for(int i = 0; i < n; i++){
            if(i % 2 == 0 && str[i] != '0'){
                count1++;
            }
            else if(i % 2 != 0 && str[i] != '1'){
                count1++;
            }
        }

        for(int i = 0; i < n; i++){
            if(i % 2 != 0 && str[i] != '0'){
                count2++;
            }
            else if(i % 2 == 0 && str[i] != '1'){
                count2++;
            }
        }
        return Math.min(count1, count2);
    }
}
//由 0、1 组成的合法交替字符串，全局只有两种固定模板：以 0 开头 → 01010101……;以 1 开头 → 10101010……
//变成这两种不同的交替二进制字符串所需要的最少操作数加起来等于 s 的长度

/**
class Solution {
    public int minOperations(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != (char) ('0' + i % 2)) {
                cnt++;
            }
        }
        return Math.min(cnt, s.length() - cnt);
    }
}
*/
