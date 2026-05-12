class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i = 0, j = n - 1; // 从右上角出发
        int count = 0;

        while (i < m && j >= 0) {
            if (grid[i][j] < 0) {
                count += m - i; // 这一列下面全是负数
                j--;
            } else {
                i++; // 这一行左边更大，往下走
            }
        }
        return count;
    }
}
//如果题目是每行每列递增：那就固定用 左下角 作为起点，逻辑对称。
