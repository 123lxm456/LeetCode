class Solution {
    public boolean canWinNim(int n) {
        if(n % 4 == 0)
        {
            return false;
        }
        return true;
    }
}
/**
class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
 */