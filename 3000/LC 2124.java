
class Solution {
    public boolean checkString(String s) {
        Boolean find = false;
        for(char str:s.toCharArray()){
            if(find && str == 'a'){
                return false;
            }
            else if(!find && str == 'b'){
                find = true;
            }
        }
        return true;
    }
}
/*
class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int lastA = -1;
        int firstB = n;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                lastA = Math.max(lastA, i);
            } else {
                firstB = Math.min(firstB, i);
            }
        }
        return lastA < firstB;
    }
}
*/