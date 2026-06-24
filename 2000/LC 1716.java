class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int num = n / 7, x = n % 7;
        for(int i = 1; i <= num; i++){
            for(int j = 0; j < 7; j++){
                sum += i + j;
            }
        }
        for(int i = 0; i < x; i++){
            sum += (num + 1 + i);
        }
        return sum;
    }
}

/**
//每天存的钱等于 week+day−1
class Solution {
    public int totalMoney(int n) {
        int week = 1, day = 1;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            res += week + day - 1;
            ++day;
            if (day == 8) {
                day = 1;
                ++week;
            }
        }
        return res;
    }
}
*/
