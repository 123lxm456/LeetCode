class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m = arr1.length, n = arr2.length, count = 0, j = 0;
        for(int i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    break;
                }
            }
            if(j==n){
                count++;
            }
        }
        return count;
    }
}
/*
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        for (int x : arr1) {
            boolean ok = true;
            for (int y : arr2) {
                ok &= Math.abs(x - y) > d;
            }
            cnt += ok ? 1 : 0;
        }
        return cnt;
    }
}

*/
