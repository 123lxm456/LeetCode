class Solution {
    public boolean checkZeroOnes(String s) {
        int n = s.length();
        int max1 = 0, max0 = 0;
        char[] str = s.toCharArray();
        int count1 = 0;
        for(int i = 0; i < n; i++){
            if(str[i] == '1'){
                count1++;
            }
            else if(str[i] == '0'){
                max1 = Math.max(count1, max1);
                count1 = 0;
            }
        }
        max1 = Math.max(count1, max1);
        int count0 = 0;
        for(int i = 0; i < n; i++){
            if(str[i] == '0'){
                count0++;
            }
            else if(str[i] == '1'){
                max0 = Math.max(count0, max0);
                count0 = 0;
            }
        }
        max0 = Math.max(count0, max0);
        return max1>max0;
    }
}