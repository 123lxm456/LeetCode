class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0, count2 = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(yuan(s.charAt(i)) && i < (n/2)){
                count1++;
            }
            else if(yuan(s.charAt(i)) && i >= (n/2)){
                count2++;
            }
        }
        return count1 == count2;
    }
    public boolean yuan(char num){
        if(num == 'a' || num == 'e' || num == 'i' || num == 'o' || num == 'u' || num == 'A' || num == 'E' || num == 'I' || num == 'O' || num == 'U'){
            return true;
        }
        return false;
    }
}

/**
class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        String h = "aeiouAEIOU";
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (h.indexOf(a.charAt(i)) >= 0) {
                sum1++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (h.indexOf(b.charAt(i)) >= 0) {
                sum2++;
            }
        }
        return sum1 == sum2;
    }
}

*/
