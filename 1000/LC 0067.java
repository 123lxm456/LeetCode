class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0; // 进位
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            sb.append(sum % 2); // 当前位
            carry = sum / 2;    // 进位
        }
        
        return sb.reverse().toString();
        /*
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        
        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;
            
            int sum = digitA + digitB + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }
        
        return result.reverse().toString();
        */
    }
}