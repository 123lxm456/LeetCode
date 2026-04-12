class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] arr = new int[100]; //10*10=100种组合：0~99
        int count = 0;
        for(int[] num:dominoes)
        {
            int a = num[0];
            int b = num[1];
            int k = a<b?a*10+b:b*10+a;
            count += arr[k];
            arr[k]++;
        }
        return count;
    }
}
