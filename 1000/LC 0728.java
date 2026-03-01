class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int num = left; num <= right; num++)
        {
            if(fun(num))
            {
                list.add(num);
            }
        }
        return list;
    }
    public boolean fun(int num)
    {
        int x = num;
        while(x != 0)
        {
            int temp = x % 10;
            if(temp == 0 || num % temp != 0)
            {
                return false;
            }
            x = x / 10;
        }
        return true;
    }
}
