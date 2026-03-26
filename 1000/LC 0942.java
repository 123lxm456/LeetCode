class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] nums= new int[n+1];
        int low = 0, high = n;
        for(int i = 0; i < n; i++)
        {
            char x = s.charAt(i);
            {
                if(x == 'I')
                {
                    nums[i] = low;
                    low++;
                }
                else
                {
                    nums[i] = high;
                    high--;
                }
            }
        }
        nums[n] = low;
        return nums;
    }
}
/**
class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length(), lo = 0, hi = n;
        int[] perm = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            perm[i] = s.charAt(i) == 'I' ? lo++ : hi--;
        }
        perm[n] = lo; // 最后剩下一个数，此时 lo == hi
        return perm;
    }
}

*/