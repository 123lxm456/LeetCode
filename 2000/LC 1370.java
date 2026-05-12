class Solution {
    public String sortString(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for(char num:s.toCharArray()){
            arr[num - 'a']++;
        }
        StringBuilder result = new StringBuilder();
        while(n>0){
            for(int i = 0; i < 26; i++){
                if(arr[i] > 0)
                {
                    result.append((char)(i + 'a'));
                    arr[i]--;
                    n--;
                }
            }
            for(int i = 25; i >= 0; i--){
                if(arr[i] > 0)
                {
                    result.append((char)(i + 'a'));
                    arr[i]--;
                    n--;
                }
            }
        }
        return result.toString();
    }
}
