class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for(int i = left; i <= right; i++)
        {
            if(jud(i))
            {
                result++;
            }
        }
        return result;
    }
    public boolean jud(int n)
    {
        int count = 0;
        while(n != 0)
        {
            count++;
            n &= n - 1;
        }
        if(count == 1)
        {
            return false;
        }
        for(int i = 2; i < count; i++)
        {
            if(count % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
