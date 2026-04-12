//套公式：奇数行 × 偶数列 + 偶数行 × 奇数列
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        
        // 统计每行每列被加了多少次
        for (int[] idx : indices) {
            row[idx[0]]++;
            col[idx[1]]++;
        }
        
        // 统计奇数行、奇数列
        int oddRow = 0, oddCol = 0;
        for (int r : row) if (r % 2 != 0) oddRow++;
        for (int c : col) if (c % 2 != 0) oddCol++;
        
        // 公式！
        return oddRow * (n - oddCol) + (m - oddRow) * oddCol;
    }
}


/**
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (((rows[i] + cols[j]) & 1) != 0) {
                    res++;
                }
            }
        }
        return res;
    }
}

*/
