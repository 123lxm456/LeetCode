class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder str = new StringBuilder();
        while(s.length() >= 2 * k)
        {
            String str1 = reverse1(s.substring(0,2 * k),k);
            str.append(str1);
            s = s.substring(2 * k, s.length());
        }
        if(s.length() < k)
        {
            String str1 = new StringBuilder(s).reverse().toString();
            str.append(str1);
        }
        else
        {
            String str1 = new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k,s.length());
            str.append(str1);
        }
        return str.toString();
    }
    public String reverse1(String s,int k)
    {
        return new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k,2*k);
    }
}
/**
class Solution {
    // 主方法：按规则反转字符串
    public String reverseStr(String s, int k) {
        // 1. 获取字符串长度，转为字符数组（String不可变，字符数组支持原地修改）
        int n = s.length();
        char[] arr = s.toCharArray();
        
        // 2. 按2k的步长遍历字符数组
        // i += 2*k：每2k个字符为一个处理单元
        for (int i = 0; i < n; i += 2 * k) {
            // 3. 确定反转的右边界：
            // - 正常情况：反转[i, i+k-1]区间（前k个字符）
            // - 剩余字符不足k个：反转[i, n-1]（所有剩余字符）
            // Math.min(i + k, n) - 1 是关键：避免右边界越界
            reverse(arr, i, Math.min(i + k, n) - 1);
        }
        
        // 4. 将修改后的字符数组转回字符串
        return new String(arr);
    }

    // 辅助方法：反转字符数组中[left, right]区间的字符（双指针法）
    public void reverse(char[] arr, int left, int right) {
        // 双指针向中间靠拢，交换字符
        while (left < right) {
            // 临时变量存储左指针字符
            char temp = arr[left];
            // 交换左右指针字符
            arr[left] = arr[right];
            arr[right] = temp;
            // 左指针右移，右指针左移
            left++;
            right--;
        }
    }
}
*/