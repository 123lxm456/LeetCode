class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m  = mat.length, n = mat[0].length;
        int[][] arr = new int[m][2];
        for(int i = 0; i < m; i++)
        {
            int count = 0;
            for(int j = 0; j < n && mat[i][j] == 1; j++)
            {
                count++;
            }
            arr[i][0] =count;
            arr[i][1] = i;        
        }
        Arrays.sort(arr,(a,b)->{
            if(a[0] != b[0])
            {
                return a[0] - b[0];
            }
            else
            {
                return a[1] - b[1];
            }
        });
        int[] result = new int[k];
        for(int i = 0; i < k; i++)
        {
            result[i] = arr[i][1];
        }
        return result;
    }
}
