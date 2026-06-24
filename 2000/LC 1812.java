class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0), digit = coordinates.charAt(1);
        if((letter- 'a') % 2 == 0 && (digit - '0') % 2 == 0){
            return true;
        }
        else if((letter- 'a') % 2 != 0 && (digit - '0') % 2 != 0){
            return true;
        }
        return false;
    }
}
/**
//从左下角开始，棋盘的行数和列数（均从 1 开始计数）之和如果为奇数，则为白色格子，如果和为偶数，则为黑色格子
class Solution {
    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0) - 'a' + 1) + (coordinates.charAt(1) - '0')) % 2 == 1;
    }
}
*/