class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int k = 0,count = 0;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0 ; j < col ;j++)
            {
                if(grid[i][j] == 1)
                {
                    count++;
                }
            }
        }
        for(int i = 0; i < row;i++)
        {
            for(int j = 0; j < col - 1; j++)
            {
                if(grid[i][j] == 1 && grid[i][j+1] == 1)
                {
                    k++;
                }
            }
        }
        for(int i = 0; i < col;i++)
        {
            for(int j = 0; j < row - 1; j++)
            {
                if(grid[j][i] == 1 && grid[j+1][i] == 1)
                {
                    k++;
                }
            }
        }
        return count * 4 - k * 2;
    }
}
/*
class Solution {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public int islandPerimeter(int[][] grid) {
    int n = grid.length, m = grid[0].length; // n=行数，m=列数
    int ans = 0; // 总周长
    for (int i = 0; i < n; ++i) { // 遍历每一行
        for (int j = 0; j < m; ++j) { // 遍历每一列
            if (grid[i][j] == 1) { // 仅处理陆地单元格
                int cnt = 0; // 当前陆地单元格贡献的周长
                for (int k = 0; k < 4; ++k) { // 检查四个方向
                    int tx = i + dx[k]; // 目标行坐标
                    int ty = j + dy[k]; // 目标列坐标
                    // 判定条件：目标越界 或 目标是海水 → 该边有效
                    if (tx < 0 || tx >= n || ty < 0 || ty >= m || grid[tx][ty] == 0) {
                        cnt += 1;
                    }
                }
                ans += cnt; // 累加当前单元格的有效边数
            }
        }
    }
    return ans;
    }
}
*/

