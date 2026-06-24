class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length, n = accounts[0].length;
        int max = 0;
        for(int i = 0; i < m; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}

/**
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
        }
        return maxWealth;
    }
}
*/
