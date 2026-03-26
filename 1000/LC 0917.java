class Solution {
    public String reverseOnlyLetters(String s) {
        List<Character> list = new ArrayList<>();
        for(char x: s.toCharArray())
        {
            if((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'))
            {
                list.add(x);
            }
        }
        int n = list.size();
        int k = n - 1;
        StringBuilder str = new StringBuilder();
        for(char x: s.toCharArray())
        {
            if((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'))
            {
                str.append(list.get(k--));
            }
            else
            {
                str.append(x);
            }
        }
        return str.toString();
    }
}
/**
//如果两个指针都扫描到字母，且 left<right，那么交换 s[left] 和 s[right]，然后继续进行扫描
class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int left = 0, right = n - 1;
        while (true) {
            while (left < right && !Character.isLetter(s.charAt(left))) { // 判断左边是否扫描到字母
                left++;
            }
            while (right > left && !Character.isLetter(s.charAt(right))) { // 判断右边是否扫描到字母
                right--;
            }
            if (left >= right) {
                break;
            }
            swap(arr, left, right);
            left++;
            right--;
        }
        return new String(arr);
    }

    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

*/