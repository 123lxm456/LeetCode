class Solution {
    public int climbStairs(int n) {
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        int p=1,q=2,i=2,m;
        while(i<n)
        {
            m=p+q;
            p=q;
            q=m;
            i++;
        }
        return q;
    }
}
/*
n=1 1
n=2   2
n=3    3
n=4   5
n=5   8
n=6  13
*/