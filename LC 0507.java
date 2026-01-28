class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1)
        {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        int i;
        for(i = 2; i < Math.sqrt(num);i++)
        {
            if(num % i == 0)
            {
                list.add(i);
                list.add(num / i);
            }
        }
        if(Math.sqrt(num) % i == 0)
        {
            list.add(i);
        }
        int sum = 1;
        for(int x:list)
        {
            sum += x;
        }
        if(sum == num)
        {
            return true;
        }
        return false;
    }
}
/**
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }

        int sum = 1;
        for (int d = 2; d * d <= num; ++d) {
            if (num % d == 0) {
                sum += d;
                if (d * d < num) {
                    sum += num / d;
                }
            }
        }
        return sum == num;
    }
}
 */
