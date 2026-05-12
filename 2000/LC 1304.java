class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        if(n % 2 == 0)
        {
            for(int i = 0; i < n/2; i++)
            {
                result[i] = -(n / 2) + i; 
            }
            for(int i = n/2; i < n; i++)
            {
                result[i] = i - (n / 2 - 1);
            }
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                result[i] = -(n / 2) + i; 
            }
        }
        return result;
    }
}

/**
//最优
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; ++i) {
            ans[index++] = i;
            ans[index++] = -i;
        }
        if (n % 2 == 1) {
            ans[index] = 0;
        }
        return ans;
    }
}

*/