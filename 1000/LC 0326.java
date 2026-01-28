/*
class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i = 0; i < 31; i++)
        {
            if(Math.pow(3,i) == n)
            {
                return true;
            }
        }
        return false;
    }
}
*/

/*
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
        {
            return false;
        }
        while(n % 3 == 0)
        {
            n = n / 3;
        }
        if(n == 1)
        {
            return true;
        }
        return false;
    }
}
*/
class Solution {
    public boolean isPowerOfThree(int n) {
        while (n!=0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
};


