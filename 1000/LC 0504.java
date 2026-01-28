class Solution {
    public String convertToBase7(int num) {
        StringBuilder str = new StringBuilder();
        int x = num;
        if(x == 0)
        {
            return "0";
        }
        if(x > 0)
        {
            while(x != 0)
            {
                int ch = x % 7;
                str.append(ch);
                x = x / 7;
            }
        }
        else
        {
            x = -x;
           while(x != 0)
            {
                int ch = x % 7;
                str.append(ch);
                x = x / 7;
            }
            str.append('-'); 
        }
        return str.reverse().toString();
    }
}
/**
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuffer digits = new StringBuffer();
        while (num > 0) {
            digits.append(num % 7);
            num /= 7;
        }
        if (negative) {
            digits.append('-');
        }
        return digits.reverse().toString();
    }
}
 */
