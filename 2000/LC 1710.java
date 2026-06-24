class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int m = boxTypes.length;
        Arrays.sort(boxTypes,(a,b)->{
            return b[1] - a[1];
        });
        int sum = 0, count = truckSize;
        for(int i = 0; i < m && count > 0; i++){
            if(boxTypes[i][0] <= count){
                sum += boxTypes[i][1] * boxTypes[i][0];
                count -= boxTypes[i][0];
            }
            else{
                sum += count * boxTypes[i][1];
                count = 0;
            }
        }
        return sum;
    }
}
