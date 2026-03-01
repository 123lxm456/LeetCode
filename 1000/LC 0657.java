class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0, l = 0, u = 0, d = 0;
        for(int i = 0; i < moves.length(); i++)
        {
            Character ch = moves.charAt(i);
            if(ch == 'R')
            {
                r++;
            }
            else if(ch == 'L')
            {
                l++;
            }
            else if(ch == 'U')
            {
                u++;
            }
            else
            {
                d++;
            }
        }
        if(r == l && u == d)
        {
            return true;
        }
        return false;
    }
}
/**
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        int length = moves.length();
        for (int i = 0; i < length; i++) {
            char move = moves.charAt(i);
            if (move == 'U') {
                y--;
            } else if (move == 'D') {
                y++;
            } else if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}
 */