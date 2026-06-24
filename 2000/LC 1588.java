class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int num = 1, sum = 0;
        while(num <= n){
            for(int i = 0; i <= n - num; i++){
                for(int j = 0; j < num; j++){
                    sum += arr[i+j];
                }
            }
            num += 2;
        }
        return sum;
    }
}
