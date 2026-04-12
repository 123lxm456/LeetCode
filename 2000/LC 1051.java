class Solution {
    public int heightChecker(int[] heights) {
        int[] newheights= new int[heights.length];
        int count = 0, i = 0;
        for(int height:heights)
        {
            newheights[i++] = height;
        }
        Arrays.sort(newheights);
        for(int j = 0; j < heights.length; j++)
        {
            if(heights[j] != newheights[j])
            {
                count++;
            }
        }
        return count;
    }
}

/**
class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length, ans = 0;
        int[] expected = new int[n];
        System.arraycopy(heights, 0, expected, 0, n);
        Arrays.sort(expected);
        for (int i = 0; i < n; ++i) {
            if (heights[i] != expected[i]) {
                ++ans;
            }
        }
        return ans;
    }
}

*/
