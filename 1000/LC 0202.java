class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = getNext(n);
        while(fast != 1 && slow != fast)
        {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }
    public int getNext(int m)
    {
        int num,sum = 0;
        while(m != 0)
        {
            num = m % 10;
            sum += num*num;
            m = m /10;
        }
        return sum;
    }
}