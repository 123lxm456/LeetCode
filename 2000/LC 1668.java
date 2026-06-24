class Solution {
    public int maxRepeating(String sequence, String word) {
        int m = sequence.length(), n = word.length();
        int max = 0;
        for(int i = 0;i <= m - n;i++){
            int k = 0;
            int j = i;
            while((j + n) <= m && word.equals(sequence.substring(j, j + n))){
                k++;
                j = j + n;
            }
            max = Math.max(max, k);
        }
        return max;
    }
}