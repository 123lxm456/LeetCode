class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        int n = str.length;
        StringBuilder newstr = new StringBuilder();
        int j = 1;
        while(j <= n){
            for(int i = 0; i < n; i++){
                if(str[i].charAt(str[i].length() - 1) == (char)('0' + j)){
                    newstr.append(str[i].substring(0,str[i].length() - 1));
                    break;
                }
            }
            if(j != n){
                newstr.append(" ");
            }
            j++;
        }
        return newstr.toString();
    }
}