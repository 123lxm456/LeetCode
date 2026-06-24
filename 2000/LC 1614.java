class Solution {
    public int maxDepth(String s) {
        int max = 0, depth = 0;
        for(char str:s.toCharArray()){
            if(str == '('){
                depth++;
                max = Math.max(max, depth);
            }
            else if(str == ')'){
                depth--;
            }
        }
        return max;
    }
}
