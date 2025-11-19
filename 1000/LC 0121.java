class Solution {
    public int maxProfit(int[] prices) {
        int i,j,max=0;
        for(i = 0;i< prices.length - 1; i++)
        {
            for(j=i+1; j< prices.length && prices[j]>prices[i]; j++)
            {
                if((prices[j] - prices[i]) > max)
                {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }
}
/**
public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
法三：
class Solution {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }
}
 */