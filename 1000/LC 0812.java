class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double max = 0;
        for(int i = 0; i < n-2; i++)
        {
            for(int j = i+1;j < n-1; j++)
            {
                for(int k = j+1; k < n; k++)
                {
                    double area = Area(points[i],points[j],points[k]);
                    max =  Math.max(max,area);
                }
            }
        }
        return max;
    }
    public double Area(int[] A, int[] B, int[] C)
    {
        double area = Math.abs(
            A[0] * (B[1] - C[1]) +
            B[0] *(C[1] - A[1]) +
            C[0] * (A[1] - B[1])
        )/2.0;
        return area;
    }
}
