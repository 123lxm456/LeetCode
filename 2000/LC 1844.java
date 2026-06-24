
class Solution {
    public String replaceDigits(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                str.append(shift(s.charAt(i-1), s.charAt(i)));
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    public char shift(char s, char i){
        return (char)(s + i - '0');
    }
}
/*
//最优
class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 1; i < n; i += 2) {
            arr[i] = (char)(arr[i - 1] + (arr[i] - '0'));
        }
        return new String(arr);
    }
}
*/
