class Solution {
    public int findComplement(int num) {
         // 步骤1：获取num的有效二进制位长度（无前置零）
        int bitLength = Integer.toBinaryString(num).length();
        // 步骤2：生成掩码（有效位全1，高位全0）
        int mask = (1 << bitLength) - 1;
        // 步骤3：取反后与掩码按位与，得到补数
        return ~num & mask;
    }
}
