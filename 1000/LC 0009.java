class Solution {
    public boolean isPalindrome(int x) {
        int y=0,curx=x;
        if(curx < 0)
        {
            return false;
        }
        while(curx != 0 )
        {
            y = y * 10 + curx % 10;
            curx = curx / 10;
        }
        return x == y;
    }
}
/*
法二：
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10; //因为存在奇偶不同的情况
    }
}
法三：
class Solution {
    public boolean isPalindrome(int x) {
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
    }
}
*/

