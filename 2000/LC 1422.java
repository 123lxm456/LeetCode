class Solution {
    public int maxScore(String s) {
        int n = s.length(), max = 0;
        char arr[] = s.toCharArray();
        for(int i = 0; i < n - 1; i++){
            max = Math.max(max, sum(arr,i));
        }
        return max;
    }
    public int sum(char[] arr, int k){
        int count = 0;
        for(int i = 0; i <= k; i++){
            if(arr[i] == '0'){
                count++;
            }
        }
        for(int i = k+1; i < arr.length; i++){
            if(arr[i] == '1'){
                count++;
            }
        }
        return count;
    }
}


/**
//两次遍历，时间复杂度更低
class Solution {
    public int maxScore(String s) {
        int score = 0;
        int n = s.length();
        if (s.charAt(0) == '0') {
            score++;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '1') {
                score++;
            }
        }
        int ans = score;
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                score++;
            } else {
                score--;
            }
            ans = Math.max(ans, score);
        }
        return ans;
    }
}

*/
