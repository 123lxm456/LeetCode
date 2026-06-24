class Solution {
    public String thousandSeparator(int n) {
        StringBuilder str = new StringBuilder();
        int num = n, k =0;
        if(n <= 100){
            return String.valueOf(n);
        }
        while(num != 0){
            int c = num % 10;
            str.append(c);
            k++;
            num /= 10;
            if(num > 0 && k == 3){
                str.append(".");
                k = 0;
            }
        }
        return str.reverse().toString();
    }
}


/**
class Solution {
    public String thousandSeparator(int n) {
        int count = 0;
        StringBuffer ans = new StringBuffer();
        do {
            int cur = n % 10;
            n /= 10;
            ans.append(cur);
            ++count;
            if (count % 3 == 0 && n != 0) {
                ans.append('.');
            }
        } while (n != 0);
        ans.reverse();
        return ans.toString();
    }
}
*/