class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str1 = new StringBuilder();
        for(char num:s.toCharArray()){
            str1.append(num - 'a' + 1);
        }
        String str = str1.toString();
        while(k > 0){
            int sum = 0;
            for(char num:str.toCharArray()){
                sum += (num - '0');
            }
            str = String.valueOf(sum);
            k--;
        }
        return Integer.parseInt(str);
    }
}
