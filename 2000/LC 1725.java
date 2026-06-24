class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = Math.min(rectangles[0][0], rectangles[0][1]), count = 1;
        for(int i = 1; i < rectangles.length; i++){
            int min = Math.min(rectangles[i][0], rectangles[i][1]);
            if(min > max){
                max  = min;
                count = 1;
            }
            else if(min == max){
                count++;
            }
        }
        return count;
    }
}
