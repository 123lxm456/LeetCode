/*
class Solution {
    public int mySqrt(int x) {
        for(int i=0;i<=x;i++)
        {
            if((long)(i*i) <= x && (long)(i+1)*(i+1) > x)
            {
                return i;
            }
        }
        return 0;
    }
}
*/
class Solution {
    public int mySqrt(int x) {
        int left = 0,right = x,mid;
        long sum;
        if(x == 0)
        {
            return 0;
        }
        if(x == 1)
        {
            return 1;
        }
        while(left <= right)
        {
            mid = (left+right)/2;
            sum = (long)mid * mid;
            if(sum == x)
            {
                return mid;
            }
            else if (sum < x)
            {
                left = mid+1;
            }
            else
            {
                right= mid -1;
            }
        }
        return left-1;
    }
}
