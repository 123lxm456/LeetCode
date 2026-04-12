class Solution {
    public int bitwiseComplement(int n) {
        int bitLength = Integer.toBinaryString(n).length(); // 获取有效位长度
        int mask = (1 << bitLength) - 1; // 生成一个 低 bitLength 位全是 1 的二进制掩码
        return  ~n & mask;
    }
}