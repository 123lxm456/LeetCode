class Solution {
    public int projectionArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int xy = 0, yz = 0, xz = 0;
        for(int i = 0; i < m; i++)
        {
            int maxxz = 0;
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] > 0)
                {
                    xy++;
                }
                maxxz = Math.max(maxxz,grid[i][j]);
            }
            xz += maxxz;
        }
        for(int j = 0; j < n; j++)
        {
            int maxyz = 0;
            for(int i = 0; i < m; i++)
            {
                maxyz = Math.max(maxyz,grid[i][j]);
            }
            yz += maxyz;
        }
        return xy+yz+xz;
    }
}

/**
//最优
class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int xyArea = 0, yzArea = 0, zxArea = 0;
        for (int i = 0; i < n; i++) {
            int yzHeight = 0, zxHeight = 0;
            for (int j = 0; j < n; j++) {
                xyArea += grid[i][j] > 0 ? 1 : 0;
                yzHeight = Math.max(yzHeight, grid[j][i]);
                zxHeight = Math.max(zxHeight, grid[i][j]);
            }
            yzArea += yzHeight;
            zxArea += zxHeight;
        }
        return xyArea + yzArea + zxArea;
    }
}
*/
