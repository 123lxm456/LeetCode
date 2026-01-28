class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        List<Integer> list = new ArrayList<>();
        int[][] newmat = new int[r][c];
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                list.add(mat[i][j]);
            }
        }
        if(r * c != list.size())
        {
            return mat;
        }
        else
        {
            int k = 0;
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                {
                    newmat[i][j] = list.get(k++);
                }
            }
        }
        return newmat;
    }
}
/**
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }

        int[][] ans = new int[r][c];
        for (int x = 0; x < m * n; ++x) {
            ans[x / c][x % c] = nums[x / n][x % n];
        }
        return ans;
    }
}
 */
