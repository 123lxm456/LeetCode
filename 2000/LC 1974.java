
class Solution {
    public int minTimeToType(String word) {
        int n = word.length();
        int sum = 0;

        int len = word.charAt(0) - 'a';
        sum += (Math.min(Math.abs(len), Math.abs(26 - len)));
        sum++;
        for(int i = 1; i < n; i++){
            int len1 = Math.abs(word.charAt(i) - word.charAt(i - 1));
            sum += (Math.min(len1, 26 - len1));
            sum++;
        }
        return sum;
    }
}
/*
//最优
class Solution {
    public int minTimeToType(String word) {
        int res = 0;
        int prev = 0; // 初始指针在 a，对应编号 0
        for (char ch : word.toCharArray()) {
            int curr = ch - 'a';
            int diff = Math.abs(curr - prev);
            // 移动最短距离 + 敲击1秒
            res += 1 + Math.min(diff, 26 - diff);
            prev = curr;
        }
        return res;
    }
}
*/
