class Solution {
    public int addDigits(int num) {
        while(num / 10 != 0)
        {
            int sum = 0;
            while(num / 10 != 0)
            {
                int m = num%10;
                sum += m;
                num = num / 10;
            }
            sum += num;
            num = sum;
        }
        return num;
    }
}
/**
法一：
class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
 */

 /**
 法二：
 class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
  */