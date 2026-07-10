class Solution {
    public int maxDistance(int[] colors) {
        int result = -1;
        for(int i = 0; i < colors.length - 1; i++){
            for(int j = colors.length - 1; j > 0;j--){
                if(colors[i] != colors[j]){
                    result = Math.max(result, j - i);
                }
            }
        }
        return result;
    }
}