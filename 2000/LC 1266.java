class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length, sum = 0;
        for(int i = 0; i < n -  1; i++)
        {
            int l1 = Math.abs(points[i][0] - points[i + 1][0]);
            int l2 = Math.abs(points[i][1] - points[i + 1][1]);
            sum += Math.max(l1, l2);
        }
        return sum;
    }
}