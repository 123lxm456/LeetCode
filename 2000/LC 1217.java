/**
把奇数位置的筹码，移到任意奇数位置 = 不花钱
把偶数位置的筹码，移到任意偶数位置 = 不花钱

只有两种选择：
全移到奇数位：需要把所有偶数变成奇数 → 花费 = 偶数的个数
全移到偶数位：需要把所有奇数变成偶数 → 花费 = 奇数的个数
*/

class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for(int num:position)
        {
            if(num % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}


/**
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for (int pos : position) {
            if ((pos & 1) != 0) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(odd, even);
    }
}

*/
