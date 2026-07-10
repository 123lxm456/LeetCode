
class Solution {
    public boolean isSameAfterReversals(int num) {
        int x = reverse(num);
        int y = reverse(x);
        return num == y;
    }
    public int reverse(int m){
        int sum = 0;
        while(m != 0){
            sum = sum * 10 + m % 10;
            m = m / 10;
        }
        return sum;
    }
}
/*
//最优
class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }
}
*/
