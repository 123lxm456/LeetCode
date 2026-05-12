class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    public boolean even(int num)
    {
        int k = 0;
        while(num != 0)
        {
            k++;
            num = num / 10;
        }
        if(k % 2 == 0)
        {
            return true;
        }
        return false;
    }
}

/**
//最优
class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
*/
