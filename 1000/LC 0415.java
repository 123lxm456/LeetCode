class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int m = num1.length(), n = num2.length();
        int k = 0,i;
        for(i = 0; i < m && i < n; i++)
        {
            int temp;
            temp = num1.charAt(i) - '0' + num2.charAt(i) - '0' + k;
            str.append(temp % 10);
            k = temp / 10;
        }
        while(i >= m && i < n)
        {
            int temp;
            temp = num2.charAt(i) - '0' + k;
            str.append(temp % 10);
            k = temp / 10;
            i++;
        }
        while(i >= n && i < m)
        {
            int temp;
            temp = num1.charAt(i) - '0' + k;
            str.append(temp % 10);
            k = temp / 10;
            i++;
        }
        if(k != 0)
        {
            str.append(k);
        }
        return str.reverse().toString();
    }
}

/**
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        // 计算完以后的答案需要翻转过来
        ans.reverse();
        return ans.toString();
    }
}

 */