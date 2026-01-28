class Solution {
    public int[] countBits(int n) {
        int[] nums = new int[n+1];
        for(int num = 0; num <= n; num++)
        {
            nums[num] = count(num);
        }
        return nums;
    }
    public int count(int num)
    {
        int c = 0;
        for(int i = 0; i < 32; i++)
        {
            if((num & 1) == 1)
            {
                c++;
            }
            num>>>=1;
        }
        return c;
    }
}
/**
class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }
}
 */