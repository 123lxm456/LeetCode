class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int num = numBottles;
        while(num >= numExchange){
            sum += num / numExchange;
            num = num / numExchange + num % numExchange;
        }
        return sum;
    }
}

/**
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int bottle = numBottles, ans = numBottles;
        while (bottle >= numExchange) {
            bottle -= numExchange;
            ++ans;
            ++bottle;
        }
        return ans;
    }
}
*/
