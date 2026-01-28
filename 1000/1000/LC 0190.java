/*
class Solution {
    public int reverseBits(int n) {
        String str = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        String str1 = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(str1, 2);
    }
}
*/
class Solution{
     public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i< 32; i++)
        {
            result <<=1;
            result |= n&1;
            n>>>=1; 
        }
        return result;
     }
}
