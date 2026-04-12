class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for(int i = 0; i < coordinates.length - 2; i++)
        {
            if(!fun(coordinates[i],coordinates[i+1], coordinates[i+2]))
            {
                return false;
            }
        }
        return true;
    }
    public boolean fun(int[] a, int[] b, int[] c)
    {
        if(((b[1] - a[1]) * (c[0] - b[0])) == ((b[0] - a[0]) * (c[1] - b[1])))
        {
            return true;
        }
        return false;
    }
}
