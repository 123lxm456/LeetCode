class Solution {
    public int numRookCaptures(char[][] board) {
        int row = board.length, col = board[0].length, rx = 0, ry = 0, count = 0;
        boolean isfound = false;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(board[i][j] == 'R')
                {
                    rx = i;
                    ry = j;
                    isfound = true;
                    break;
                }
            }
            if(isfound)
            {
                break;
            }
        }
        for(int i = rx - 1; i >= 0; i--)
        {
            if(board[i][ry] == 'B')
            {
                break;
            }
            else if(board[i][ry] == 'p')
            {
                count++;
                break;
            }
        }
        for(int i = rx + 1; i < row; i++)
        {
            if(board[i][ry] == 'B')
            {
                break;
            }
            else if(board[i][ry] == 'p')
            {
                count++;
                break;
            }
        }
        for(int i = ry - 1; i >= 0; i--)
        {
            if(board[rx][i] == 'B')
            {
                break;
            }
            else if(board[rx][i] == 'p')
            {
                count++;
                break;
            }
        }
        for(int i = ry + 1; i < col; i++)
        {
            if(board[rx][i] == 'B')
            {
                break;
            }
            else if(board[rx][i] == 'p')
            {
                count++;
                break;
            }
        }
        return count;
    }
}

/**
//最优
class Solution {
    public int numRookCaptures(char[][] board) {
        int cnt = 0, st = 0, ed = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (board[i][j] == 'R') {
                    st = i;
                    ed = j;
                    break;
                }
            }
        }
        for (int i = 0; i < 4; ++i) {
            for (int step = 0;; ++step) {
                int tx = st + step * dx[i];
                int ty = ed + step * dy[i];
                if (tx < 0 || tx >= 8 || ty < 0 || ty >= 8 || board[tx][ty] == 'B') {
                    break;
                }
                if (board[tx][ty] == 'p') {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}

*/
