class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i = 1; i < n; i++){
            int num = arr[i] - arr[i - 1];
            max =  Math.max(num, max);
        }
        return max;
    }
}

/**
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int mx = 0;
        for (int i = 1; i < points.length; i++) {
            mx = Math.max(points[i][0] - points[i - 1][0], mx);
        }
        return mx;
    }
}

*/