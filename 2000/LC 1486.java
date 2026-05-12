class Solution {
    public int xorOperation(int n, int start) {
        int i = 0,result = 0;
        while(i < n){
            int num = start + 2 * i;
            result ^= num;
            i++;
        }
        return result;
    }
}
