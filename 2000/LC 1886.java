//困难
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        // 最多旋转4次，0/90/180/270
        for (int k = 0; k < 4; k++) {
            if (isEqual(mat, target, n)) {
                return true;
            }
            mat = rotate90(mat, n);
        }
        return false;
    }

    // 顺时针旋转90度，返回新矩阵
    private int[][] rotate90(int[][] mat, int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = mat[i][j];
            }
        }
        return res;
    }

    // 判断两个矩阵是否完全相同
    private boolean isEqual(int[][] a, int[][] b, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}