class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int origincolor = image[sr][sc];
        if(origincolor == color)
        {
            return image;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr,sc});
        image[sr][sc] = color;
        while(!queue.isEmpty())
        {
            int[] cur = queue.poll();
            int m = cur[0];
            int n = cur[1];
            for(int i = 0; i < image.length; i++)
            {
                for(int j = 0; j < image[0].length; j++)
                {
                    if ((( (i == m - 1 || i == m + 1) && j == n ) || ( (j == n - 1 || j == n + 1) && i == m )) && (image[i][j] == origincolor))
                    {
                        image[i][j] = color;
                        queue.add(new int[]{i,j});
                    }
                }
            }
        }
        return image;
    }
}
/**
class Solution {
    int[] dx = {1, 0, 0, -1};
    int[] dy = {0, 1, -1, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currColor = image[sr][sc];
        if (currColor == color) {
            return image;
        }
        int n = image.length, m = image[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = color;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < n && my >= 0 && my < m && image[mx][my] == currColor) {
                    queue.offer(new int[]{mx, my});
                    image[mx][my] = color;
                }
            }
        }
        return image;
    }
}
*/

/**
//DFS
class Solution {
    int[] dx = {1, 0, 0, -1};
    int[] dy = {0, 1, -1, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currColor = image[sr][sc];
        if (currColor != color) {
            dfs(image, sr, sc, currColor, color);
        }
        return image;
    }

    public void dfs(int[][] image, int x, int y, int currColor, int color) {
        if (image[x][y] == currColor) {
            image[x][y] = color;
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < image.length && my >= 0 && my < image[0].length) {
                    dfs(image, mx, my, currColor, color);
                }
            }
        }
    }
}

*/
