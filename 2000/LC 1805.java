class Solution {
    public int numDifferentIntegers(String word) {
        StringBuilder str = new StringBuilder();
        for(char x:word.toCharArray()){
            if(x >= 'a' && x <= 'z'){
                str.append(" ");
            }
            else{
                str.append(x);
            }
        }
        String[] nums = str.toString().trim().split("\\s+");
        Set<String> set = new HashSet<>();
        for(String num:nums){
            if(num.isEmpty()){
                continue;
            }
            String x = trimzero(num);
            set.add(x);
        }
        return set.size();
    }
    public String trimzero(String num){
        int idx = 0;
        while(idx < num.length() && num.charAt(idx) == '0'){
            idx++;
        }
        if(idx == num.length()){
            return "0";
        }
        return num.substring(idx);
    }
}

/**
class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<String>();
        int n = word.length(), p1 = 0, p2;
        while (true) {
            while (p1 < n && !Character.isDigit(word.charAt(p1))) {
                p1++;
            }
            if (p1 == n) {
                break;
            }
            p2 = p1;
            while (p2 < n && Character.isDigit(word.charAt(p2))) {
                p2++;
            }
            while (p2 - p1 > 1 && word.charAt(p1) == '0') { // 去除前导 0
                p1++;
            }
            set.add(word.substring(p1, p2));
            p1 = p2;
        }
        return set.size();
    }
}
*/