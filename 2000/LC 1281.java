class Solution {
    public int subtractProductAndSum(int n) {
        int num1 = 1, num2 = 0;
        while(n != 0)
        {
            int x = n % 10;
            num1 *= x;
            num2 += x;
            n = n / 10;
        }
        return num1 - num2;
    }
}
