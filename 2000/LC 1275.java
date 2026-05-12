/*
class Solution {
    public String tictactoe(int[][] moves) {
        char[][] grid = new char[3][3];
        for(int i = 0; i < moves.length; i++)
        {
            int x = moves[i][0];
            int y = moves[i][1];
            if(i % 2 == 0)
            {
                grid[x][y] = 'X';
            }
            else
            {
                grid[x][y] = 'O';
            }
        }

        //判断行
        for(int i = 0; i < 3; i++)
        {
            if(grid[i][0] == 'X' && grid[i][1] == 'X' && grid[i][2] == 'X')
            {
                return "A";
            }
            if(grid[i][0] == 'O' && grid[i][1] == 'O' && grid[i][2] == 'O')
            {
                return "B";
            }
        }

        //判断列
        for(int i = 0; i < 3; i++)
        {
            if(grid[0][i] == 'X' && grid[1][i] == 'X' && grid[2][i] == 'X')
            {
                return "A";
            }
            if(grid[0][i] == 'O' && grid[1][i] == 'O' && grid[2][i] == 'O')
            {
                return "B";
            }
        }

        //判断对角线
        if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X')
        {
            return "A";
        }
        else if(grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X')
        {
            return "A";
        }
        else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')
        {
            return "B";
        }
        else if(grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O')
        {
            return "B";
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}
*/

class Solution {

    public String tictactoe(int[][] moves) {
        // 8种赢法（把3x3棋盘展平成 0~8）
        int[][] wins = {
            {0,1,2}, {3,4,5}, {6,7,8},  // 行
            {0,3,6}, {1,4,7}, {2,5,8},  // 列
            {0,4,8}, {2,4,6}             // 对角线
        };

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        for (int i = 0; i < moves.length; i++) {
            // 把坐标转成 0~8 的数字
            int pos = moves[i][0] * 3 + moves[i][1];

            if (i % 2 == 0) { // A 下
                A.add(pos);
                if (checkWin(A, wins)) return "A";
            } else { // B 下
                B.add(pos);
                if (checkWin(B, wins)) return "B";
            }
        }

        // 下满9步=平局，否则继续
        return moves.length == 9 ? "Draw" : "Pending";
    }

    // 判断是否赢了
    public boolean checkWin(Set<Integer> set, int[][] wins) {
        for (int[] win : wins) {
            boolean flag = true;
            for (int pos : win) {
                if (!set.contains(pos)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
        }
        return false;
    }
}
