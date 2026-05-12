class Solution {
    public int countOdds(int low, int high) {
        int num = high - low + 1;
        if(low % 2 != 0 && high % 2 != 0){
            return num / 2 + 1;
        }
        return num / 2;
    }
}

/**
//定义 pre(x) 为区间 [0,x] 中奇数的个数
class Solution {
    public int countOdds(int low, int high) {
        return pre(high) - pre(low - 1);
    }

    public int pre(int x) {
        return (x + 1) >> 1;
    }
}
*/
