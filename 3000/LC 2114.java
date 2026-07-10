class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s:sentences){
            String[] num = s.split(" ");
            max = Math.max(max, num.length);
        }
        return max;
    }
}