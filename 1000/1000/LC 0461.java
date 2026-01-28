class Solution {
    public int hammingDistance(int x, int y) {
        int k = 0;
        for(int i = 0; i < 32; i++)
        {
            if((x & 1) == 1 && (y & 1) == 0 || ((x & 1) == 0 && (y & 1)==1))
            {
                k++;
            }
            x>>=1;
            y>>=1;
        }
        return k;
    }
}
/**
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
 */

 /**
class Solution {
    public int hammingDistance(int x, int y) {
        int s = x ^ y, ret = 0;
        while (s != 0) {
            ret += s & 1;
            s >>= 1;
        }
        return ret;
    }
}
  */