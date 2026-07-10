class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for(int i = 0; i < tickets.length; i++){
            if(i < k){
                time += (Math.min(tickets[k], tickets[i]));
            }
            else if(i > k){
                time += (Math.min(tickets[k] - 1, tickets[i]));
            }
        }
        return time + tickets[k];
    }
}

/*
设目标人票数：target = tickets[k]
总时间分两部分：
排在 k 前面的所有人：每个人最多贡献 min(自己票数, target) 秒
排在 k 后面的所有人：每个人最多贡献 min(自己票数, target - 1) 秒
再加上目标人自己的 target 张票耗时
*/
