/*
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int total = m * n;
        k = k % total;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < m; i++)
        {
            List<Integer> list1 = new ArrayList<>();
            for(int j = 0; j < n; j++)
            {
                int num = (i * n + j - k + total) % total;
                int x = num / n;
                int y = num % n;
                list1.add(grid[x][y]);
            }
            list.add(list1);
        }
        return list;
    }
}
*/

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            ret.add(row);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index1 = (i * n + j + k) % (m * n);
                ret.get(index1 / n).set(index1 % n, grid[i][j]);
            }
        }
        return ret;
    }
}

