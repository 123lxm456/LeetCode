class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i =  0; i < 32; i++)
        {
            if(Math.pow(2,i) == n)
            {
                return true;
            }
        }
        return false;
    }
}
/**
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

 */