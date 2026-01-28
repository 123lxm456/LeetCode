class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = duration;
        for(int i = 1; i < timeSeries.length; i++)
        {
            if(timeSeries[i] <= timeSeries[i - 1] + duration - 1)
            {
                count += timeSeries[i] - timeSeries[i - 1];
            }
            else
            {
                count += duration;
            }
        }
        return count;
    }
}
