class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String str = s.toUpperCase();
        StringBuilder stra = new StringBuilder();
        StringBuilder strb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != '-')
            {
                stra.append(str.charAt(i));
            }
        }
        str = stra.toString();
        for(int i = str.length() - 1; i >= 0; i--)
        {
            
            strb.append(str.charAt(i));
            count++;
            if(count == k && i != 0)
            {
                strb.append("-");
                count = 0;
            }
        }
        return strb.reverse().toString();
    }
}
/**
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1, cnt = 0; i >= 0; i--) {
            if (s.charAt(i) == '-') continue;
            if (cnt == k && (cnt = 0) >= 0) sb.append("-");
            sb.append(s.charAt(i));
            cnt++;
        }
        return sb.reverse().toString().toUpperCase();
    }
}
 */