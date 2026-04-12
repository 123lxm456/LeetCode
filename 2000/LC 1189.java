class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] cnt = new int[5];
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch == 'b') {
                cnt[0]++;
            } else if (ch == 'a') {
                cnt[1]++;
            } else if (ch == 'l') {
                cnt[2]++;
            } else if (ch == 'o') {
                cnt[3]++;
            } else if (ch == 'n') {
                cnt[4]++;
            }
        }
        cnt[2] /= 2;
        cnt[3] /= 2;
        return Arrays.stream(cnt).min().getAsInt();
    }
}

/*
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26]; // 统计26个小写字母频率
        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }
        
        // 依次取：b, a, l, o, n 的数量
        int b = count[1];  // 'b'-'a' = 1
        int a = count[0];  // 'a'-'a' = 0
        int l = count[11] / 2; // l需要2个，除以2
        int o = count[14] / 2; // o需要2个，除以2
        int n = count[13]; // 'n'-'a' =13
        
        // 最小值就是答案
        return Math.min(Math.min(Math.min(a,b), l), Math.min(o,n));
    }
}
*/
