class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        for(int i = 1; i <= (n/2); i++)
        {
            if(nozero(i) && nozero(n - i))
            {
                result[0] = i;
                result[1] = n - i;
                break;
            }
        }
        return result;
    }
    public boolean nozero(int num)
    {
        while(num != 0)
        {
            if(num % 10 != 0)
            {
                num = num / 10;
            } 
            else
            {
                return false;
            }
        }
        return true;
    }
}

/**
//最优
class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int A = 1; A < n; ++A) {
            int B = n - A;
            if (!String.valueOf(A).contains("0") && !String.valueOf(B).contains("0")) {
                return new int[]{A, B};
            }
        }
        return new int[0];
    }
}

*/
