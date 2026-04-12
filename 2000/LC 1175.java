class Solution {
    public int numPrimeArrangements(int n) {
        int p = countPrimes(n);
        return (int)(fun(p) * fun(n - p) % 1000000007);
    }
    public int countPrimes(int n)
    {
        int count = 0;
        for(int i = 2; i <= n; i++)
        {
            boolean isprime = true;
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    isprime = false;
                    break; 
                }
            }
            if(isprime)
            {
                count++;
            }
        }
        return count;
    }
    public long fun(int n)
    {
        long sum = 1;
        while(n >= 1)
        {
            sum = sum * n % 1000000007;
            n--;
        }
        return sum;
    }
}
//Math.pow(10,9)+7 = 1000000007;  double 无法精确表示所有大整数，会出现精度丢失
