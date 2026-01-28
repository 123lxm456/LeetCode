class Solution {
    public String toHex(int num) {
        StringBuilder str = new StringBuilder();
        // int是32位，每4位对应1位十六进制，循环8次
        for(int i = 0; i < 8; i++) 
        {
            // 取低4位的数值（0-15），替代num % 16，避免负数问题
            int temp = num & 0xf;
            if(temp >= 10)
            {
                str.append((char)(temp - 10 + 'a'));
            }
            else
            {
                str.append(temp);
            }
            num >>>= 4;
            if(num == 0)
            {
                break;
            }
        }
        return str.reverse().toString();
    }
}
