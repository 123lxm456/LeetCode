class Solution {
    public String convertToTitle(int columnNumber) {
        int m,n;
        StringBuilder str = new StringBuilder();
        m = columnNumber;
        while(m > 0)
        {
            m--;
            n = m % 26;
            str.append((char)('A'+ n));
            m = m / 26;
        }
        return str.reverse().toString();
    }
}