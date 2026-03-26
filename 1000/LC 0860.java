//收 5 美元：无需找零，直接增加 5 美元的数量；
//收 10 美元：必须找零 5 美元（唯一选择），若没有 5 美元则返回 false；
//收 20 美元：优先找零「10+5」（保留更多 5 美元），若没有则找零「3 张 5 美元」，都没有则返回 false；
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0, count10 = 0;
        for(int bill:bills)
        {
            if(bill == 5)
            {
                count5++;
            }
            else if(bill == 10)
            {
                if(count5 == 0)
                {
                    return false;
                }
                count5--;
                count10++;
            }
            else
            {
                if(count5 >= 1 && count10 >= 1)
                {
                    count10--;
                    count5--;
                }
                else if(count5 >= 3)
                {
                    count5 = count5 - 3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}
