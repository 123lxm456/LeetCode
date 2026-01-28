/*
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int[][] M = new int[m][n];
        int max = 0;
        for(int k = 0; k < ops.length; k++)
        {
            int num1 = ops[k][0];
            int num2 = ops[k][1];
            for(int i = 0; i < num1; i++)
            {
                for(int j = 0; j < num2; j++)
                {
                    
                    M[i][j]++;
                    if(M[i][j] > max)
                    {
                        max = M[i][j];
                    }
                }
            }

        }
        int num = 0;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(M[i][j] == max)
                {
                    num++;
                }
            }
        }
        return num;
    }
}
*/
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        // 初始化最小行、最小列为m、n（默认是整个数组）
        int minRow = m;
        int minCol = n;
        
        // 遍历所有操作，找到最小的行和列
        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }
        
        // 最小行 × 最小列 就是最大值出现的次数
        return minRow * minCol;
    }
}