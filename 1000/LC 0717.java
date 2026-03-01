class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i;
        for(i = 0; i < bits.length - 1; i++)
        {
            if(bits[i] == 1)
            {
                i++;
            }
        }
        return i!=bits.length;
    }
}
/**
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
*/
