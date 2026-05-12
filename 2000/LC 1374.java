class Solution {
    public String generateTheString(int n) {
        StringBuilder result = new StringBuilder();
        if(n % 2 == 0)
        {
            for(int i = 0; i < n - 1; i++){
                result.append('a');
            }
            result.append('b');
        }
        else{
            for(int i = 0; i < n; i++){
                result.append('a');
            }
        }
        return result.toString();
    }
}

/**
//最优
class Solution {
    public String generateTheString(int n) {
        StringBuffer sb = new StringBuffer();
        if (n % 2 == 1) {
            return sb.append("a".repeat(n)).toString();
        }
        return sb.append("a".repeat(n - 1)).append("b").toString();
    }
}
*/